package com.weiyu.designPattern.abstractFactory;

public class PearFactory implements IFactory {
    @Override
    public IFruit create() {
        return new Pear();
    }
}
