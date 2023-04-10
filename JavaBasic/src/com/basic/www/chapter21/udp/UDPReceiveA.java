package com.basic.www.chapter21.udp;

import com.sun.org.apache.xerces.internal.impl.XMLEntityHandler;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 15:36
 */
public class UDPReceiveA {
    public static void main(String[] args) throws IOException {
        //接收端
        //创建一个DatagramSocket对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //构建一个DatagramPacket对象，准备接收数据
        //UDP协议数据报最大64K
        byte[] buf = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //调用接收方法,将通过网络传输的packet对象填充到oacket对象中
        //当有数据包发送到本机的9999端口时，就会接收到数据
        //如果没有数据报发送到本机的9999端口，就睡阻塞等待。
        System.out.println("接收端A等待接收数据。。。");
        socket.receive(packet);
        //可以把packet进行拆包，取出数据并显示
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);
        byte[] bytes = "好的，明天见".getBytes();
        DatagramPacket packet1 =
                new DatagramPacket(bytes, bytes.length, InetAddress.getByName("DC-Home"), 9998);
        socket.send(packet1);
        //关闭流
        socket.close();
        System.out.println("A端退出");
    }
}
