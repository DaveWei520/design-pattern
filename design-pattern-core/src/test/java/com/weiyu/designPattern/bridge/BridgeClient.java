package com.weiyu.designPattern.bridge;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/11 10:20
 * @since 1.0.0
 */
public class BridgeClient {

    @Test
    public void test(){
        Circle redCircle = new Circle(2,3,4,new RedCircle());
        Circle greenCircle = new Circle(2,3,4,new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
