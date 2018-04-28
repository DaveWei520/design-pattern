package com.weiyu.designPattern.abstractFactory;

public class AppleFactory implements IFactory {
    @Override
    public IFruit create() {
        return new Apple();
    }
}
