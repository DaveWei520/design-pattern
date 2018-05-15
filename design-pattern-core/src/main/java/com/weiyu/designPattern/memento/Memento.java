package com.weiyu.designPattern.memento;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 9:49
 * @since 1.0.0
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
