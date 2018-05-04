package com.weiyu.designPattern.adapter;

/**
 * @author weiyu
 * @description 用于类适配器及对象适配器
 * @create 2018/5/3 10:04
 * @since 1.0.0
 */
public class Usber implements Usb{

    @Override
    public void isUsb() {
        System.out.println("======USB口");
    }
}
