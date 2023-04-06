package com.basic.www.chapter21.inetaddress_;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-06 11:25
 */
public class InetAddress_ {
    public static void main(String[] args) throws UnknownHostException {
        //InetAdress使用
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DC-Home/192.168.31.215  主机名+ip地址
        //根据指定的主机名获取InetAddress对象
        InetAddress host01 = InetAddress.getByName("DC-Home");
        System.out.println("host01=" + host01);//host01=DC-Home/192.168.31.215
        //根据域名返回InetAddress对象，比如www.baidu.com 对应
        InetAddress host02 = InetAddress.getByName("www.baidu.com");
        System.out.println("host02=" + host02);//host02=www.baidu.com/14.119.104.189
        //通过InetAddress对象，获取对应的地址
        String hostAddress = host02.getHostAddress();
        System.out.println("host02对应的ip地址=" + hostAddress);//host02对应的ip地址=14.119.104.189
        //通过InetAddress对象，获取主机名
        String hostName = host01.getHostName();
        System.out.println("host01的主机名=" + hostName);//host01的主机名=DC-Home
    }
}
