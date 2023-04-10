package com.basic.www.chapter21.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.stream.Stream;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 14:11
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //文件上传的客户端
        //客户端连接服务端，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //文件路径
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\demo01\\a.jpg";
        //创建读取磁盘文件的输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //bytes就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //通过socket获取到输出流，将bytes发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容，写入到字节通道
        bis.close();//管流
        socket.shutdownOutput();//设置写入数据的结束标记
        //接收从服务端回复的消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine());

        //关闭流
        br.close();
        bos.close();
        socket.close();
    }
}
