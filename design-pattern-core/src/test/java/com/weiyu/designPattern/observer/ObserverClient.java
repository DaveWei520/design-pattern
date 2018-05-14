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
        Observer userZhang = new User("张三");
        Observer userLi = new User("李四");
        Observer userWang = new User("王五");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);

        server.setInfomation("服务器即将维护更新");

        System.out.println("======移除张三");
        //移除张三
        server.removeObserver(userZhang);
        server.setInfomation("再次发布更新消息");
    }
}
