package com.weiyu.prototype.demo;

/**
 * @author weiyu
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 * @description 原型模式
 * @create 2017/12/26
 */
class Prototype implements Cloneable {

    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}

class ConcretePrototype extends Prototype {
    public void show(){
        System.out.println("原型模式实现类");
    }
}

public class PrototypeClient {

    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i < 10; i++){
            ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
            clonecp.show();
        }
    }
}
