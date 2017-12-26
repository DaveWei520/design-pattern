package com.weiyu.abstractFactory;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/23
 */
public class SmsSendFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
