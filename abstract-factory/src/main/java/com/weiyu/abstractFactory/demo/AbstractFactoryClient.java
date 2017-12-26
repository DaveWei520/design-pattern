package com.weiyu.abstractFactory.demo;


/**
 * @author weiyu
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类
 * @description 抽象工厂模式
 * @create 2017/12/26
 */
interface IProduct1 {
    void show();
}

interface IProduct2 {
    void show();
}

class Product1 implements IProduct1 {

    @Override
    public void show() {
        System.out.println("这是1型产品");
    }
}

class Product2 implements IProduct2 {

    @Override
    public void show() {
        System.out.println("这是2型产品");
    }
}

interface IFactory {
    IProduct1 createProduct1();
    IProduct2 createProduct2();
}

class Factory implements IFactory {

    @Override
    public IProduct1 createProduct1() {
        return new Product1();
    }

    @Override
    public IProduct2 createProduct2() {
        return new Product2();
    }
}

public class AbstractFactoryClient {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
