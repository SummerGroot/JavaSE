package com.basic.www.chapter27.regexp;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther : Summer
 * @Classname RegExp03
 * @Description
 * @Date 2023/7/4 22:00
 * @Created by Summer
 * @Version: 1.0
 */
public class RegExp03 {
    public static void main(String[] args) {
        //字符匹配符
        String content = "a11c8abcABC";
        //正则规则
        //String regStr = "[a-z]";//匹配a-z之间任意一个字符
        //String regStr = "[A-Z]";//匹配A-Z之间任意一个字符
        String regStr = "abc";//匹配abc字符串[默认区分大小写]
        //String regStr = "(?i)abc";//不区分大小写
        //创建pattern 对象
        Pattern pattern = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE);//不区分大小写
        //创建matcher对象
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }

    @Test
    public void test01() {
        String content = "a11c8abcABC";
        //String regExp = "[^a-z]";
        String regExp = "[^a-z{2}]";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 ：" + matcher.group(0));
        }
    }
}
