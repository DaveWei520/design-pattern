package com.weiyu.designPattern.interpreter;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:28
 * @since 1.0.0
 */
public class NumExpression implements ArithmeticExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
