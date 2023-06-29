package com.basic.www.chapter25.jdbc.myjdbc;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Auther : Summer
 * @Classname JdbcConn
 * @Description
 * @Date 2023/6/29 15:18
 * @Created by Summer
 * @Version: 1.0
 */
public class JdbcConn {
    //连接mysql的5种方式
    @Test
    //方式1
    public void connect01() throws SQLException {
        //创建driver对象
        Driver driver = new Driver();
        //
        String url = "jdbc:mysql://localhost:3306/fxy_db02";
        //将用户名和密码放到配置文件种Properties对象
        Properties properties = new Properties();
        //user 和 password 是写好了，后的值根据实际情况写
        properties.setProperty("user", "root");//用户名
        properties.setProperty("password", "123456");//密码
        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    @Test
    //方式2
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //使用反射加载Driver类,动态加载，更加灵活，减少依赖性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        //创建Driver对象
        Driver driver = (Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/fxy_db02";
        //将用户名和密码放到配置文件种Properties对象
        Properties properties = new Properties();
        //user 和 password 是写好了，后的值根据实际情况写
        properties.setProperty("user", "root");//用户名
        properties.setProperty("password", "123456");//密码
        Connection connect = driver.connect(url, properties);
        System.out.println("方式2=" + connect);
    }

    @Test
    //方式3 DriverManager 替代 Driver
    public void connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        //使用反射加载Driver类
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        //创建Driver对象
        Driver driver = (Driver) aClass.newInstance();
        //创建url  user password
        String url = "jdbc:mysql://localhost:3306/fxy_db02";
        String user = "root";
        String password = "123456";
        //注册Driver驱动
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("方式3 = " + connection);

    }

    @Test
    //方式4 Class.forName()自动完成注册驱动
    //这种方式推荐使用
    public void connect04() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        //使用反射得到Driver类
        //在加载Driver类时，完成注册
        /*
        源码
        static {  静态代码块，在类加载时，会执行一次
            try {
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                //注册driver工作已经完成
            } catch (SQLException var1) {
                throw new RuntimeException("Can't register driver!");
            }
        }
        */
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        //创建url  user password
        String url = "jdbc:mysql://localhost:3306/fxy_db02";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("方式4 = " + connection);
        /*
         * 1、mysql驱动5.1.6可以无需Class.forName("com.mysq;.jdbc.Driver");
         * 2、从jdk1.5以后使用jdbc4，不再需要显示调用class.forName()注册而是自动调用驱动
         * jar包下META-INF\services\java.sql.Driver文本种的类名称去注册*/
    }

    @Test
    //方式5:在方式4的基础上优化，增加配置文件，让连接mysql更加灵活
    public void connect05() throws ClassNotFoundException, IOException, SQLException {
        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\com\\basic\\www\\chapter25\\jdbc\\myjdbc\\mysql.Properties"));
        // 获取URL user password
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");

        //Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("方式5=" + connection);

    }

}
