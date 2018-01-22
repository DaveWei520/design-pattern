package com.weiyu.visitor.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author weiyu
 * 封装某些作用于某种数据结构中各元素的操作，
 * 它可以在不改变数据结构的前提下定义作用于这些元素的新的操作
 * @description 访问者模式
 * @create 2018/01/22
 */
abstract class Element {
    public abstract void accept(IVisitor visitor);
    public abstract void doSomething();
}

interface IVisitor{
    void visit(ConcreteElement1 el1);
    void visit(ConcreteElement2 el2);
}

class ConcreteElement1 extends Element {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("这是元素1");
    }
}

class ConcreteElement2 extends Element {

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("这是元素2");
    }
}

class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}

class ObjectStruture {
    public static List<Element> getList(){
        List<Element> list = new ArrayList<>();
        Random ran = new Random();
        for (int i=0; i<10; i++){
            int a = ran.nextInt(100);
            if (a > 50)
                list.add(new ConcreteElement1());
            else
                list.add(new ConcreteElement2());
        }
        return list;
    }
}

public class VisitorClient {

    public static void main(String[] args) {
        List<Element> list = ObjectStruture.getList();
        for (Element e:list){
            e.accept(new Visitor());
        }
    }
}
