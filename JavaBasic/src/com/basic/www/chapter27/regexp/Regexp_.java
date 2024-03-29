package com.basic.www.chapter27.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther : Summer
 * @Classname Regexp_
 * @Description
 * @Date 2023/6/30 18:00
 * @Created by Summer
 * @Version: 1.0
 */
public class Regexp_ {
    //正则表达式,文本处理的遍历
    public static void main(String[] args) {
        //编写了爬虫，从百度得到了如下文本
        String content = "Java是世界上使用最广泛的编程语言之一。" +
                "Java最初由Sun Microsystems在1990年代开发，用于开发从Web应用程序到移动应用程序到批处理应用程序的所有内容。" +
                "Java最初是一种纯粹的面向对象的语言，但现在已经发展成为一种多范例语言，可以高度适应任何情况。" +
                "拥有庞大的开发人员社区和支持库，Java是开发几乎所有类型的应用程序的理想选择。" +
                "Java是最初由开发James Gosling(詹姆斯·高斯林，他被称为Java编程语言之父)在Sun Microsystems公司（现已经被Oracle收购），" +
                "并于1995年发布了作为Sun公司的一个核心组成部分Java平台。" +
                "James Gosling(詹姆斯·高斯林)，Mike Sheridan(迈克·谢里丹)和Patrick Naughton(帕特里克·诺顿)于1991年6月启动了Java语言项目。" +
                "Java最初是为交互式电视设计的，但在当时的数字有线电视行业来说太先进了。该语言最初是在James Gosling(詹姆斯·高斯林)办公室外的一棵橡树之后被称为Oak的。" +
                "后来，该项目以Green命名，并最终从Java coffee(印度尼西亚的一种咖啡)重命名为Java。";

        //传统方法，使用遍历的方式
        //正则表达式

        //提取文章中所有的英文单词
        //1、先创建Pattern对象，模式对象，可以李济成是一个正则表达式对象
        //Pattern pattern = Pattern.compile("[a-zA-Z]+");
        //提取文章中所有的数字
        //Pattern pattern = Pattern.compile("[0-9]+");
        //提取文章中所有的英文单词和数字
        Pattern pattern = Pattern.compile("([0-9]+)|([a-zA-Z]+)");
        //提取百度热搜标题

        //2、创建匹配器对象
        //matcher匹配器安装pattern(模式),到content文本中去匹配
        //找到就返回true，否则false
        Matcher mather = pattern.matcher(content);
        //3、开始循环匹配
        while (mather.find()) {
            //匹配内容，放到m.group(0)
            System.out.println("找到：" + mather.group(0));
        }


    }
}
