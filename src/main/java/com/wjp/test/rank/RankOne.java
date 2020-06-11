package com.wjp.test.rank;

import org.springframework.stereotype.Component;

/**
 * @author wjp
 * @date 2020/6/9 10:33
 */
@Component
public class RankOne implements Ranks {
    private String rank = "RankOne";

    @Override
    public String toString() {
        return this.rank;
    }

}
