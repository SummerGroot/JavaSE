package com.basic.www.chapter21.socket_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 10:46
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        //连接服务器端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());
        OutputStream ops = socket.getOutputStream();
        //要求使用字符流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ops));
        bw.write("hello,server 字符流");
        bw.newLine();//插入一个换行符，表示写入的内容结束,注意，要求对方使用readLine()读取！！！
        bw.flush();//使用字符流，需要刷新，否则数据不会写入数据通道
        //获取和socket关联的输入流，读取数据（字节），并显示
        InputStream ips = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(ips));
        System.out.println(br.readLine());
        //关闭外层流
        br.close();
        bw.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
