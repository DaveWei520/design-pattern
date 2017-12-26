package com.weiyu.observer;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 has received!");
    }
}
