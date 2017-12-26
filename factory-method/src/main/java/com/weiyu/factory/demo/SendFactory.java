package com.weiyu.factory.demo;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/23
 */
public class SendFactory {

    public Sender produce(String type) {
        switch (type) {
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
            default:
                System.out.println("请输入正确的类型!");
                return null;
        }
    }
}
