package com.weiyu.abstractFactory;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/23
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mail sender!");
    }
}
