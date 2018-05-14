package com.weiyu.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyu@gomefinance.com.cn
 * @description
 * @create 2018/5/14 16:06
 * @since 1.0.0
 */
public class WechatServer implements Observerable{
    private List<Observer> list;
    private String message;

    public WechatServer(){
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!list.isEmpty())
            list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void setInfomation(String message){
        this.message = message;
        System.out.println("微信服务更新消息："+message);
        notifyObserver();
    }
}
