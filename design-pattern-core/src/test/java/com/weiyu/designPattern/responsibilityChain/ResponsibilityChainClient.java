package com.weiyu.designPattern.responsibilityChain;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 17:17
 * @since 1.0.0
 */
public class ResponsibilityChainClient {

    @Test
    public void test(){
        AbstractHandler handler1 = new MyHandler("handler1");
        AbstractHandler handler2 = new MyHandler("handler2");
        AbstractHandler handler3 = new MyHandler("handler3");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.operate();
    }
}
