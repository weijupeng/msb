package com.wjp.designmode.create.adstractfactory;

import com.wjp.designmode.create.factory.MailSender;
import com.wjp.designmode.create.factory.Sender;

/**
 * @author wjp
 * @date 2020/6/9 14:27
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
