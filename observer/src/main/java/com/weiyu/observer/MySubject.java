package com.weiyu.observer;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("update self");
        notifyObservers();
    }
}
