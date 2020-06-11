package com.wjp.designmode.create.adstractfactory;

import com.wjp.designmode.create.factory.Sender;

/**
 * @author wjp
 * @date 2020/6/9 14:26
 */
public interface Provider {
    Sender produce();
}
