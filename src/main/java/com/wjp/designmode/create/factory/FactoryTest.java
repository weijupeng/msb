package com.wjp.designmode.create.factory;

/**
 * @author wjp
 * @date 2020/6/9 14:21
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sms = sendFactory.produce("sms");
        sms.send();
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}
