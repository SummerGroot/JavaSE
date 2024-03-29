package com.basic.www.chapter21.socket_;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-06 18:02
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        //连接服务器端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());
        OutputStream ops = socket.getOutputStream();
        ops.write("hello,server".getBytes());
        //设置结束标记
        socket.shutdownOutput();
        //获取和socket关联的输入流，读取数据（字节），并显示
        InputStream ips = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readlen = 0;
        while ((readlen = ips.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readlen));
        }
        ips.close();
        ops.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
