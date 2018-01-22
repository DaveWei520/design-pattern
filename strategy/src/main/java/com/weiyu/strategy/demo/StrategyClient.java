package com.weiyu.strategy.demo;

/**
 * @author weiyu
 * 定义一组算法，将每个算法都封装起来，并且使他们之间可以互换
 * @description 策略模式
 * @type 行为类模式
 * @create 2018/01/22
 */
interface IStrategy {
    void doSomething();
}

class ConcreteStrategy1 implements IStrategy{

    @Override
    public void doSomething() {
        System.out.println("具体策略1");
    }
}

class ConcreteStrategy2 implements IStrategy{

    @Override
    public void doSomething() {
        System.out.println("具体策略2");
    }
}

class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doSomething();
    }
}

public class StrategyClient {

    public static void main(String[] args) {
        Context context;
        System.out.println("------执行策略1------");
        context = new Context(new ConcreteStrategy1());
        context.execute();

        System.out.println("------执行策略2------");
        context = new Context(new ConcreteStrategy2());
        context.execute();
    }
}
