package com.wjp.test.file;

import java.io.File;

/**
 * @author wjp
 * @date 2020/6/8 14:20
 */
public class FileGetFunctionDemo {
    public static void main(String[] args) {
        File file = new File("D:\\test\\123.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath" + absolutePath);
        System.out.println("getName()" + file.getName());
        System.out.println("getPath()" + file.getPath());
        System.out.println("size" + file.length());
    }
}
