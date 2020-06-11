package com.wjp.msb.utils;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wjp
 * @date 2020/4/23 16:13
 */
@Data
public class CreditInfo {
    private String customerId;
    private String userName;
    private String mobile;
    private String idNo;
    private String creditTime;
    private String creditStatus;
    private BigDecimal creditAmount;
    private BigDecimal creditUsedAmount;
    private BigDecimal creditAvailAmount;
    private String describe;

}
