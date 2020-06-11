package com.wjp.designmode.create.factory;

/**
 * @author wjp
 * @date 2020/6/9 14:18
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailSender");
    }
}
