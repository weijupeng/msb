package com.wjp.designmode.create.adstractfactory;

import com.wjp.designmode.create.factory.Sender;
import com.wjp.designmode.create.factory.SmsSender;

/**
 * @author wjp
 * @date 2020/6/9 14:27
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
