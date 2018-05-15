package com.weiyu.designPattern.visitor;

public interface IElement {
    void accept(IVisitor visitor);
    void doSomething();
}
