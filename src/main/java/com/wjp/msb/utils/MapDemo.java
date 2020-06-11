package com.wjp.msb.utils;

import java.util.HashMap;
import java.util.Set;

/**
 * @author wjp
 * @date 2020/4/22 15:29
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person person = new Person();
        map.put(person, "124");
        Set<Person> people =
                map.keySet();

    }
}
