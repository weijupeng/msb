package com.wjp.designmode.create.factory;

/**
 * @author wjp
 * @date 2020/6/9 14:19
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }


    public static Sender produceSms() {
        return new SmsSender();
    }

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }
        if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("轻松输入正确的类型");
            return null;
        }
    }
}
