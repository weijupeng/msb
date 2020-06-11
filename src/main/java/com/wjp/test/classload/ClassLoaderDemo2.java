package com.wjp.test.classload;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author wjp
 * @date 2020/6/9 11:34
 */
public class ClassLoaderDemo2 {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        //获取当前类的加载器
        ClassLoader loader = ClassLoaderDemo2.class.getClassLoader();
        //使用类加载器对象调用函数获取加载配置文件的字节输入流
        InputStream in = loader.getResourceAsStream("stu.ini");
        //调用函数加载配置文件中内容
//		p.load(new FileInputStream("stu.ini"));
        p.load(in);
        //输出内容
        System.out.println(p);

    }
}
