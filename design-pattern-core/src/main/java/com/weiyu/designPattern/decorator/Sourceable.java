package com.weiyu.designPattern.decorator;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class Sourceable implements Source {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
