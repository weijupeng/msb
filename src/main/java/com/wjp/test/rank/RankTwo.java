package com.wjp.test.rank;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author weijupeng
 */
@Component
@Order(2)
public class RankTwo implements Ranks {

    private String rank = "RankTwo";

    @Override
    public String toString() {
        return this.rank;
    }
}
