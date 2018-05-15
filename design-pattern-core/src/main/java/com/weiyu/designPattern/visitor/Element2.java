package com.weiyu.designPattern.visitor;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:51
 * @since 1.0.0
 */
public class Element2 implements IElement {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("这里是元素2");
    }
}
