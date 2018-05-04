package com.weiyu.designPattern.adapter;

/**
 * @author weiyu
 * @description 接口适配器模式，通过抽象类来适配
 * @create 2018/5/3 10:07
 * @since 1.0.0
 */
public class InterfaceAdapter extends SomeDraw {
    @Override
    public void drawCircle() {
        System.out.println("======画圆形");
    }

    @Override
    public void drawStar() {
        System.out.println("======画星形");
    }
}
