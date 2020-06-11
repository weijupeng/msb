package com.wjp.msb.utils;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * @author wjp
 * @date 2020/4/24 15:13
 */
public class Demo {
    private static List<HashMap<String, String>> list = new ArrayList<>(10);

    public void addList(HashMap<String, String> map) {
        boolean isExist = false;
        for (HashMap<String, String> hashMap : list) {
            if (!StringUtils.isEmpty(hashMap.get(map.keySet().iterator().next()))) {
                isExist = true;
                return;
            }
        }
        if (isExist) {

            //cunzai
        } else {
            //bucuanzai
        }
    }

    public List getList() {
        return list;
    }


}
