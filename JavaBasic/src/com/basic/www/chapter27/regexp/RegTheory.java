package com.basic.www.chapter27.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther : Summer
 * @Classname RegTheory
 * @Description
 * @Date 2023/7/4 20:21
 * @Created by Summer
 * @Version: 1.0
 */
public class RegTheory {
    public static void main(String[] args) {
        //分析正则表达式的底层实现
        String content = "1998Java是世界上使用最广泛的编程语言之一。" +
                "Java最初由Sun Microsystems在1990年代开发，用于开发从Web应用程序到移动应用程序到批处理应用程序的所有内容。" +
                "Java最初是一种纯粹的面向对象的语言，但现在已经发展成为一种多范例语言，可以高度适应任何情况。" +
                "拥有庞大的开发人员社区和支持库，Java是开发几乎所有类型的应用程序的理想选择。" +
                "Java是最初由开发James Gosling(詹姆斯·高斯林，他被称为Java编程语言之父)在Sun Microsystems公司（现已经被Oracle收购），" +
                "并于1995年发布了作为Sun公司的一个核心组成部分Java平台。" +
                "James Gosling(詹姆斯·高斯林)，Mike Sheridan(迈克·谢里丹)和Patrick Naughton(帕特里克·诺顿)于1991年6月启动了Java语言项目。" +
                "Java最初是为交互式电视设计的，但在当时的数字有线电视行业来说太先进了。该语言最初是在James Gosling(詹姆斯·高斯林)办公室外的一棵橡树之后被称为Oak的。" +
                "后来，该项目以Green命名，并最终从Java coffee(印度尼西亚的一种咖啡)重命名为Java。";
        //目标：匹配所有四个数字
        //1、\\d 表示一个任意的数字 0~9
        //String regStr = "\\d\\d\\d\\d";
        String regStr = "(\\d\\d)(\\d\\d)";
        //什么时分组，比如：(\d\d)(\d\d)，正则表达式中有()，
        //表示分组，第一个括号，表示第一组，第二个小括号表示第二组，以此类推
        //2、创建模式对象[即正则表达式对象]
        Pattern pattern = Pattern.compile(regStr);
        //3、创建匹配器
        //说明：创建匹配器matcher，按照正则表达式的规则，去匹配content字符串
        Matcher matcher = pattern.matcher(content);
        //4、开始匹配
        /*
        * matcher.find()完成的任务
        * 1、根据指定的规则，定位满足规则的子字符串(比如1998)((19)(89))
        * 2、找到后，将子字符串的开始索引记录到matcher对象的属性 int[] groups;
        *   groups[0] = 0,把该子字符串的结束的索引+1的值记录到groups[1] = 4
        *   如果是分组 记录1组()匹配的字符串groups[2]= 0 groups[3] = 2
        *            记录2组()匹配的字符串groups[4]= 2 groups[5] = 4
        *            如果有更多的分组  以此类推
        *3、同时记录odLast的值为 子字符串结束的 索引+1的值即4，即下次执行find时，就从4开始匹配
        *
        * matcher.group(0)分析
        *源码
        public String group(int group) {
        if (first < 0)
            throw new IllegalStateException("No match found");
        if (group < 0 || group > groupCount())
            throw new IndexOutOfBoundsException("No group " + group);
        if ((groups[group*2] == -1) || (groups[group*2+1] == -1))
            return null;
        return getSubSequence(groups[group * 2], groups[group * 2 + 1]).toString();
        }
        * 1、根据groups[0]=0 和 groups[1]=4 的记录的位置，从content开始截取子字符串返回
        *  [0,4)
        *如果再次执行find()，仍然按照上面的分析
        * */
        while (matcher.find()) {
            //1、如果正则表达式有() 即分组
            //2、取出匹配的字符串规则如下
            //3、groups(0) 表示匹配到的子字符串
            //4、groups(1) 表示匹配到的子字符串的第1组字串
            //5、但是分组不能越界
            System.out.println("找到：" + matcher.group(0));
            System.out.println("第1组()匹配到的值=" + matcher.group(1));
            System.out.println("第2组()匹配到的值=" + matcher.group(2));
        }
    }
}
