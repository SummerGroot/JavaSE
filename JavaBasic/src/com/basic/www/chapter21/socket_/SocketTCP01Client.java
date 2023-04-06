package com.basic.www.chapter21.socket_;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-06 11:56
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //客户端
        //连接服务器（ip，端口）
        //连接本机的9999端口，如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回="+socket.getClass());
        //连接上后，生成socket，通过socket.getOutputStream()
        //客户端发送hello，server发给服务端
        //得到和socket对象关联的输出流对象
        OutputStream ops = socket.getOutputStream();
        //通过输出流，写入数据到数据通道
        ops.write("hello,server".getBytes());
        //关闭流和socket，必须关闭
        ops.close();
        socket.close();
        System.out.println("客户端退出。。。。");
    }
}
