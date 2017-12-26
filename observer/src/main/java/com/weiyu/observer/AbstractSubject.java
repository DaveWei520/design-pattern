package com.weiyu.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }

    @Override
    public void operation() {

    }
}
