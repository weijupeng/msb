package com.wjp.msb.classloader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author wjp
 * @date 2020/6/4 15:01
 */
public class Demo3 {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child = " + child);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(13);
        Iterator<Object> iterator = objects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "1");
        String s = map.get("2");
        System.out.println("s = " + s);
        System.out.println(map.size());
        if (map.entrySet().iterator().hasNext()) {
            System.out.println(map.entrySet().iterator().next().getKey() + map.entrySet().iterator().next().getValue());
        }
    }
}
