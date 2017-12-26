package com.weiyu.bridge;

/**
 * @author weiyu@gomeholdings.com
 * @description 桥接模式
 * @create 2017/6/26
 */
public abstract class Bridge {
    private Sourceable source;

    public void method(){
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
