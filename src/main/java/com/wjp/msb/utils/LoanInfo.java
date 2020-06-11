package com.wjp.msb.utils;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author wjp
 * @date 2020/4/23 16:49
 */
@Data
public class LoanInfo {
    private String vbsBid;
    private String CooperaOrderId;
    private BigDecimal repayAmount;
    private String repayTime;
    private Integer repayStatus;
    private String deducteFlowId;
    private String vbsRepayDescribe;
}
