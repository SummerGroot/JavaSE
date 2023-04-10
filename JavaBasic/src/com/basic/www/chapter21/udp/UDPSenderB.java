package com.basic.www.chapter21.udp;

import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.net.*;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 15:36
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //发送端
        //创建DatagramSocket对象，准备发送和(9998端口)接收数据
        DatagramSocket socket = new DatagramSocket(9998);
        //将需要发送的数据，封装到DatagreamPacket对象中
        byte[] bytes = "hello,明天吃火锅".getBytes();
        //封装的DatagreamPacket对象  data内容字节数组，长度，主机ip，端口号
        DatagramPacket packet =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("DC-Home"), 9999);
        socket.send(packet);
        //接收
        byte[] buf = new byte[64 * 1024];
        DatagramPacket packet1 = new DatagramPacket(buf, buf.length);
        System.out.println("接收端B等到接收数据");
        socket.receive(packet1);
        int length = packet1.getLength();
        byte[] data = packet1.getData();
        String s = new String(data, 0, length);
        System.out.println(s);
        socket.close();
        System.out.println("B端退出");
    }
}
