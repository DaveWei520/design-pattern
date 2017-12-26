package com.weiyu.factory.demo;

/**
 * @author weiyu
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使一个类的实例化延迟到其子类
 * @description 工厂方法模式
 * @create 2017/12/26
 */
class Engine {
    public void build(){
        System.out.println("======组装汽车引擎");
    }
}

class Chassis {
    public void build(){
        System.out.println("======组装汽车底盘");
    }
}

class Wheel {
    public void build(){
        System.out.println("======组装汽车轮胎");
    }
}

interface ICar {
    void build();
}

class Car implements ICar {
    private Engine engine;
    private Chassis chassis;
    private Wheel wheel;

    public Car(Engine engine, Chassis chassis, Wheel wheel){
        this.engine = engine;
        this.chassis = chassis;
        this.wheel = wheel;
    }

    @Override
    public void build() {
        engine.build();
        chassis.build();
        wheel.build();
        System.out.println("======汽车组装完成");
    }
}

interface IFactory {
    ICar createCar();
}

class Factory implements IFactory {

    @Override
    public ICar createCar() {
        Engine engine = new Engine();
        Chassis chassis = new Chassis();
        Wheel wheel = new Wheel();
        return new Car(engine, chassis, wheel);
    }
}

public class FactoryClient {
    public static void main(String[] args) {
        IFactory factory = new Factory();
        ICar car = factory.createCar();
        car.build();
    }
}
