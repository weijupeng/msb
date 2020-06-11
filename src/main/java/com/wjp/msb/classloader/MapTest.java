package com.wjp.msb.classloader;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        //1:创建一个集合 存储  字符 以及其出现的次数
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //友情提示
        System.out.println("请录入一个字符串:");
        String line = new Scanner(System.in).nextLine();
        //2:遍历字符串
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            //判断 该字符 是否在键集中
            //说明这个字符没有出现过
            if (!map.containsKey(c)) {
                //那就是第一次
                map.put(c, 1);
            } else {
                //先获取之前的次数
                Integer count = map.get(c);
                count++;
                //再次存入  更新
                map.put(c, count);
            }
        }
        System.out.println(map);
    }
}