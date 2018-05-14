package com.weiyu.designPattern.observer;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 16:03
 * @since 1.0.0
 */
public interface Observerable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
