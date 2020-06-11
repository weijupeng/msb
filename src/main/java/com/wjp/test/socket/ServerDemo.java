package com.wjp.test.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wjp
 * @date 2020/6/8 15:55
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务端套接字对象
        ServerSocket ss = new ServerSocket(16888);
        // 侦听并获取客户端套接字对象
        Socket s = ss.accept();
        // 获取输入流，关联通道
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // 创建输出流关联目的地文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\copy.txt"));
        // 读取数据
        String line = null;
        while ((line = br.readLine()) != null) {
            // 将从客户端获取的数据写到目的地文件中
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        // 关闭资源
        s.close();
        ss.close();
        bw.close();//由于输出流直接关联的是文件，所以要单独关闭资源
    }
}

