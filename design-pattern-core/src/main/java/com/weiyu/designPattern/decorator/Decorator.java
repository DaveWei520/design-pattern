package com.weiyu.designPattern.decorator;

/**
 * @author weiyu
 * @description
 * @create 2018/5/3 10:28
 * @since 1.0.0
 */
public class Decorator implements Source {
    private Source source;

    public Decorator(Source source){
        this.source = source;
    }

    public void decorate(){
        System.out.println("======decorate");
    }

    @Override
    public void method() {
        decorate();
        source.method();
    }
}
