package com.weiyu.designPattern.bridge;

/**
 * @author weiyu@gomefinance.com.cn
 * @description
 * @create 2018/5/11 10:28
 * @since 1.0.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
