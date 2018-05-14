package com.weiyu.designPattern.responsibilityChain;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 17:20
 * @since 1.0.0
 */
public class MyHandler extends AbstractHandler {
    private String name;

    public MyHandler(String name){
        this.name = name;
    }
    @Override
    public void operate() {
        System.out.println(name+"deal!");
        if (getHandler() != null)
            getHandler().operate();
    }
}
