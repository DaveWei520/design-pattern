package com.weiyu.factory.demo;

import com.weiyu.abstractFactory.MailSendFactory;
import com.weiyu.abstractFactory.Provider;
import com.weiyu.abstractFactory.Sender;
import com.weiyu.abstractFactory.SmsSendFactory;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/23
 */
public class FactoryTest {

    @Test
    public void abstractFactoryTest(){
        Provider provider = new MailSendFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
