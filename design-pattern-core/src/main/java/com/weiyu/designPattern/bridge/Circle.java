package com.weiyu.designPattern.bridge;

/**
 * @author weiyu
 * @description
 * @create 2018/5/11 10:29
 * @since 1.0.0
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(x,y,radius);
    }
}
