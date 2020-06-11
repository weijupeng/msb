package com.wjp.msb.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wjp
 * @date 2020/4/24 11:09
 */
@Getter
@AllArgsConstructor
public enum ProductCode {
    /**
     * 合作产品
     */
    XXB("xxbei", "先先呗"),
    JBEI("jiebei", "借呗"),
    WXSDZFB("wxsd-zfb", "维信闪贷-支付宝"),
    DDQOPPO("ddq-oppo", "豆豆钱-OPPO"),
    TCJQNEW("tcjq-new", "甜橙借钱-新"),
    DDTCJQ("dd-tcjq", "豆豆-甜橙借钱"),
    ;


    private String key;
    private String value;
}
