package com.weiyu.proxy;

/**
 * @author weiyu@gomeholdings.com
 * @description 代理模式
 * @create 2017/6/26
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        System.out.println("before proxy!");
        source.method();
        System.out.println("after proxy!");
    }
}
