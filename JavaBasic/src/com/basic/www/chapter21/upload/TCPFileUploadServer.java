package com.basic.www.chapter21.upload;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version: java version 1.8
 * @Author: Mr Summer
 * @description:
 * @date: 2023-04-07 14:11
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //文件上传的服务端
        //服务端在本机监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听");
        //等待客户端连接
        Socket socket = serverSocket.accept();
        //通过socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //将得到的bytes数组，写入到指定的路径，得到一个文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\Notes\\Java\\JavaNotes\\file_\\demo02\\a.jpg"));
        bos.write(bytes);
        bos.close();
        //想客户端回复“收到图片“
        //通过socket获取到输出流(字符)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.newLine();
        bw.flush();//把内容刷新到数据通道
        socket.shutdownOutput();//设置结束标记
        //关闭流
        bw.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
