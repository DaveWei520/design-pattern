package com.weiyu.designPattern.factoryMethod;

public class FactoryA implements IFactory {
    @Override
    public IProduct create() {
        return new ProductA();
    }
}
