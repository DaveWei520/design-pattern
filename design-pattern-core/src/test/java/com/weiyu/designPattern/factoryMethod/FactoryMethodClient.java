package com.weiyu.designPattern.factoryMethod;

import org.junit.Test;

public class FactoryMethodClient {

    @Test
    public void test(){
        IFactory factoryA = new FactoryA();
        factoryA.create().product();
        IFactory factoryB = new FactoryB();
        factoryB.create().product();
    }
}
