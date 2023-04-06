package com.basic.www.chapter21.socket_;

import sun.java2d.pipe.SpanIterator;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-06 11:53
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //服务端
        //在本机的9999端口监听，等待连接，要求在本机没有其他服务在监听9999
        //这个ServerSocket可以通过accept()返回多个Socket[多个客户端连接服务器]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接");
        //当没有客户端连接9999端口是，程序会阻塞，等待连接
        //如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务器端socket=" + socket.getClass());
        //通过socket.getInputStream()读取
        InputStream ips = socket.getInputStream();
        //客户端写入到数据通道的数据，显示IO读取
        byte[] buf = new byte[1024];//设置缓冲，一次最多读取1024个
        int readlen = 0;
        while ((readlen = ips.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readlen));//根据读取到的实际长度，显示内容
        }
        //关闭流
        ips.close();
        socket.close();
        serverSocket.close();

    }
}
