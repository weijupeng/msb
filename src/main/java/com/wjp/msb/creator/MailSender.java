package com.wjp.msb.creator;

/**
 * @author wjp
 * @date 2020/5/18 14:43
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
