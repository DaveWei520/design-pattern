package com.weiyu.designPattern.observer;

/**
 * @author weiyu@gomefinance.com.cn
 * @description
 * @create 2018/5/14 16:13
 * @since 1.0.0
 */
public class User implements Observer {
    private String name;
    private String message;

    public User(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read(){
        System.out.println(name+" 收到推送消息："+message);
    }
}
