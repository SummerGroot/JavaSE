package com.basic.www.chapter21.upload;

import java.io.*;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 14:24
 */
public class StreamUtils {
    //将输入流转换成byte[]，即可以把文件的内容读入到byte[]
    public static byte[] streamToByteArray(InputStream is) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建输出流对象
        byte[] buf = new byte[1024];//字节数组
        int len;
        while ((len = is.read(buf)) != -1) {//循环读取
            bos.write(buf, 0, len);//把读取到的数据，写入bos
        }
        byte[] array = bos.toByteArray();//然后将bos转成字节数组
        bos.close();
        return array;
    }

    public static String streamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }
}
