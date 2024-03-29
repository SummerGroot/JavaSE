package com.basic.www.chapter21.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-06 18:09
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        //监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器端9999端口监听，等待连接");
        //监听来自客户端的连接,并返回socket对象
        Socket socket = serverSocket.accept();
        System.out.println("服务器端socket=" + socket.getClass());
        //通过socket.getInputStream()读取
        InputStream ips = socket.getInputStream();
        //建立缓冲
        byte[] buf = new byte[1024];
        //读取长度
        int readlen = 0;
        //循环读取
        while ((readlen = ips.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readlen));
        }
        //获取socket相关联的输出流
        OutputStream ops = socket.getOutputStream();
        ops.write("hello,client".getBytes());
        //设置结束标记
        socket.shutdownOutput();
        //关闭流
        ips.close();
        ops.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务器端关闭");
    }
}
