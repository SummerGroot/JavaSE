package com.basic.www.chapter21.socket_;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 10:46
 */
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端9999端口监听，等待连接");
        //监听来自客户端的连接,并返回socket对象
        Socket socket = serverSocket.accept();
        System.out.println("服务器端socket=" + socket.getClass());
        //使用InputStreamReader将inputStream转换为字符流
        InputStream ips = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(ips));
        String s = br.readLine();
        System.out.println(s);//输出

        //获取socket相关联的输出流
        OutputStream ops = socket.getOutputStream();
        //使用字符输出流的方式回复
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ops));
        bw.write("hello,client 字符流");
        bw.newLine();//插入换行符。表示回复内容的结束
        bw.flush();//刷新，将数据通道清空

        //关闭流
        bw.close();//关闭外层流
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器端关闭");

    }
}
