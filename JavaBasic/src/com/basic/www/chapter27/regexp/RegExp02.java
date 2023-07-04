package com.basic.www.chapter27.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Auther : Summer
 * @Classname RegExp02
 * @Description
 * @Date 2023/7/4 21:47
 * @Created by Summer
 * @Version: 1.0
 */
public class RegExp02 {
    public static void main(String[] args) {
        //转义字符
        //String content = "abc$(abc(123(";
        String content = "xxx@qq.com";
        //匹配(
        //String regStr = "\\(";
        String regStr = "\\.";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
