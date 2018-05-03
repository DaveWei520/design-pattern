package com.weiyu.designPattern.adapter;

/**
 * @author weiyu@gomefinance.com.cn
 * @description 对象适配器，通过组合来实现适配器功能
 * @create 2018/5/3 10:00
 * @since 1.0.0
 */
public class ObjectAdapter implements Ps2 {
    private Usb usb;

    public ObjectAdapter(Usb usb){
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}