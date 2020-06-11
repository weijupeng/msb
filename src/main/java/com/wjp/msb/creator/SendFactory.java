package com.wjp.msb.creator;

/**
 * @author wjp
 * @date 2020/5/18 14:43
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
