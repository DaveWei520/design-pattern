package com.weiyu.designPattern.factoryMethod;

public class FactoryB implements IFactory {
    @Override
    public IProduct create() {
        return new ProductB();
    }
}
