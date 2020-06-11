package com.wjp.msb.creator;

/**
 * @author weijupeng
 */
public class FactoryTest {

    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
    }
}