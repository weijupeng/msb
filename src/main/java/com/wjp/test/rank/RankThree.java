package com.wjp.test.rank;

import org.springframework.stereotype.Component;

/**
 * @author weijupeng
 */
@Component
public class RankThree implements Ranks {

    private String rank = "RankThree";

    @Override
    public String toString() {
        return this.rank;
    }
}