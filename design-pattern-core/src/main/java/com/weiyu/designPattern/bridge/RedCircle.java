package com.weiyu.designPattern.bridge;

/**
 * @author weiyu
 * @description
 * @create 2018/5/11 10:26
 * @since 1.0.0
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing Circle[ color: red, radius:"+radius +", x: " +x+", "+ y +"]");
    }
}
