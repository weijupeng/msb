package com.wjp.test.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端  启动 , 等待连接 .... ");
        // 创建服务端套接字对象
        ServerSocket ss = new ServerSocket(10086);
        //侦听并获取客户端套接字
        Socket s = ss.accept();
        //创建输入流关联通道
        InputStream is = s.getInputStream();
        //将字节流变为字符缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //读取浏览器的请求信息 即请求行 GET /web/index.html HTTP/1.1
        String request = br.readLine();
        //按空格进行切割
        String[] arr = request.split(" ");
        //拿出请求资源路径，并将web前面的/去掉
        String path = arr[1].substring(1);
//        System.out.println(path);//web/index.html
        //创建字节输入流对象关联客户端请求服务器端的资源文件即web/index.html中的内容
        FileInputStream fis = new FileInputStream(path);//相对路径
        //定义数组
        byte[] buf = new byte[1024];
        //定义变量保存每次读取的字节个数
        int len = 0;
        //获取向通道写数据的字节输出流
        OutputStream os = s.getOutputStream();
        // 写入HTTP协议响应头,固定写法
        /*
            响应头中包含响应的http协议版本HTTP/1.1
            服务器返回的状态码 200
            状态值:OK
         */
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        //Content-Type:text/html表示响应文本的类型
        os.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());
        //循环
        while ((len = fis.read(buf)) != -1) {
            //向通道中书写读取的数据
            os.write(buf, 0, len);
        }

        s.close();
        ss.close();
    }
}