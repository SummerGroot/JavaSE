package com.basic.www.chapter19.writer_;

import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {
        //文件路径
        String filePath = "G:\\Notes\\Java\\JavaNotes\\file_\\note.txt";
        //创建FileWriter对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath);//默认覆盖写入
            //write(int)：写入单个字符
            fileWriter.write('F');
            //write(char[])：写入指定数组
            fileWriter.write(chars);
            //write(char[],off,len)：写入整个字符串
            fileWriter.write("summerEdu".toCharArray(), 0, 3);
            //write(string)：写入整个字符串
            fileWriter.write("你好成都！！！");
            //write(string,off,len)：写入字符串的指定部分。
            fileWriter.write("你好世界", 0, 2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //对应FileWriter，一定要关闭流，或者flush才能真正的把数据写入到文件
            try {
                //fileWriter.close();
                //关闭文件流，等价flush()+close()
                fileWriter.flush();
                /*
                追源码！！！StreamEncode

                */
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("程序结束");
    }
}
