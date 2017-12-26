package com.weiyu.templateMethod;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class Plus extends AbstractCalculator {
    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
