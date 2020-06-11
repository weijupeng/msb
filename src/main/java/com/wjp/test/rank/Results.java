package com.wjp.test.rank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author weijupeng
 */
@Component
public class Results {
    @Autowired
    private List<Ranks> ranks;

    @Override
    public String toString() {
        return ranks.toString();
    }
}