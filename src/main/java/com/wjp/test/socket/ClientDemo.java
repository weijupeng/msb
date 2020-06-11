package com.wjp.test.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * @author weijupeng
 */ /*
 * TCP的客户端 带反馈信息的文件的上传实现
 *  数据源：文件，FileReader。
 * 	目的地：通道，getOutputStream,所以也需要转为字符流，OutputStreamWriter,然后需要换行，所以用BufferedWriter。
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        // 创建客户端套接字对象
        Socket s = new Socket("127.0.0.1", 16888);
        //创建输入流关联数据源文件
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\weijupeng\\Desktop\\TR740sql.txt"));//day11表示模块名
        //创建输出流关联通道
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        //读写数据
        String line = null;
        //这里是读取数据，读取到文件末尾，有结束标识null，读取完毕循环结束
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //关闭资源
        br.close();//由于输入流直接关联的是文件，所以要单独关闭资源
        s.close();
    }
}