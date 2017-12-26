package com.weiyu.adapter;

/**
 * @author weiyu@gomeholdings.com
 * @description 对象的适配器模式
 * @create 2017/6/26
 */
public class Wrapper implements Targetable {
    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
