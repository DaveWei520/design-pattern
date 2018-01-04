package com.weiyu.observer.demo;

import java.util.Vector;

/**
 * @author weiyu
 * 定义对象间一种一对多的依赖关系，使得当每一个对象改变状态，
 * 则所有依赖于它的对象都会得到通知并自动更新
 * @description 观察者模式
 * @create 2018/01/04
 */
abstract class Subject{
    private Vector<Observer> obs = new Vector();

    public void addObserver(Observer obs){
        this.obs.add(obs);
    }

    public void delObserver(Observer obs){
        this.obs.remove(obs);
    }

    protected void notifyObserver(){
        for (Observer o : obs){
            o.update();
        }
    }

    public abstract void doSomething();
}

class ConcreteSubject extends Subject{

    @Override
    public void doSomething() {
        System.out.println("被观察者事件反应");
        this.notifyObserver();
    }
}

interface Observer {
    public void update();
}

class ConcreteObserver1 implements Observer{

    @Override
    public void update() {
        System.out.println("观察者1收到信息，并进行处理");
    }
}

class ConcreteObserver2 implements Observer{

    @Override
    public void update() {
        System.out.println("观察者2收到信息，并进行处理");
    }
}

public class ObserverClient {
    public static void main(String[] args) {
        Subject sub = new ConcreteSubject();
        sub.addObserver(new ConcreteObserver1());
        sub.addObserver(new ConcreteObserver2());
        sub.doSomething();
    }
}
