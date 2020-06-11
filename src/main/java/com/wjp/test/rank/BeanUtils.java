package com.wjp.test.rank;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author wjp
 * @date 2020/6/9 10:46
 */
@Component
public class BeanUtils {
    public static ConfigurableApplicationContext applicationContext;

    public static <T> T getBeab(Class<T> c) {
        return applicationContext.getBean(c);
    }
}
