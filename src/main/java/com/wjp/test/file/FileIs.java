package com.wjp.test.file;

import java.io.File;

/**
 * @author weijupeng
 */
public class FileIs {
    public static void main(String[] args) {
        File f = new File("D:\\aaa\\bbb.java");
        File f2 = new File("D:\\aaa");
        // 判断是否存在
        System.out.println("D:\\aaa\\bbb.java 是否存在:" + f.exists());
        System.out.println("D:\\aaa 是否存在:" + f2.exists());
        // 判断是文件还是目录
        System.out.println("D:\\aaa 文件?:" + f2.isFile());
        System.out.println("D:\\aaa 目录?:" + f2.isDirectory());
    }


}