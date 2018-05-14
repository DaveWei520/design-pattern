package com.weiyu.designPattern.observer;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 15:56
 * @since 1.0.0
 */
public class ObserverClient {

    @Test
    public void test(){
        WechatServer server = new WechatServer();
        server.registerObserver(new User("张三"));
        server.registerObserver(new User("李四"));
        server.registerObserver(new User("王五"));

        server.setInfomation("服务器即将维护更新");
    }
}
