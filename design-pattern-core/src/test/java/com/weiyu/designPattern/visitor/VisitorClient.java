package com.weiyu.designPattern.visitor;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:42
 * @since 1.0.0
 */
public class VisitorClient {

    @Test
    public void test(){
        IVisitor visitor = new Visitor();
        IElement element1 = new Element1();
        element1.accept(visitor);
        System.out.println("======");
        IElement element2 = new Element2();
        element2.accept(visitor);
    }
}
