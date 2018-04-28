package com.weiyu.designPattern.factoryMethod;

import org.junit.Test;

public class FactoryMethodClient {

    @Test
    public void test(){
        CarFactory carFactory = new CarFactory();
        carFactory.getCar("SUV").drive();
    }
}
