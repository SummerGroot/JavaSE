package com.basic.www.chapter19.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-03 17:04
 */
public class Properties01 {
    public static void main(String[] args) throws IOException {
        //读取mysql.properties文件，并得到相应数据
        BufferedReader br = new BufferedReader(new FileReader("G:\\IDEA\\JavaStudy\\JavaSE\\JavaBasic\\src\\mysql.properties"));
        String line = "";
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            String[] split = line.split("=");//split 字符串切割
            System.out.println(split[0] + "值是：" + split[1]);
        }
        br.close();
    }
}
