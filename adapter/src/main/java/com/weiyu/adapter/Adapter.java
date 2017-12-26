package com.weiyu.adapter;

/**
 * @author weiyu@gomeholdings.com
 * @description 类的适配器模式
 * @create 2017/6/26
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
