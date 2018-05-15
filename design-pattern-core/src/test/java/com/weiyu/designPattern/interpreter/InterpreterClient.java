package com.weiyu.designPattern.interpreter;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:23
 * @since 1.0.0
 */
public class InterpreterClient {

    @Test
    public void test(){
        Calculator calculator = new Calculator("123 + 124 + 111");
        System.out.println("计算结果为："+calculator.calculate());
    }
}
