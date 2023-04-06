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
 * @date: 2023-04-06 18:09
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        //连接服务器端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回="+socket.getClass());
        OutputStream ops = socket.getOutputStream();
        ops.write("hello,server".getBytes());
        ops.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
