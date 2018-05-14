package com.weiyu.designPattern.strategy;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 15:25
 * @since 1.0.0
 */
public class StrategyClient {

    @Test
    public void testAdd(){
        ICalculator calculator = new Add();
        System.out.println(calculator.calculate(1,2));
    }

    @Test
    public void testSubtract(){
        ICalculator calculator = new Subtract();
        System.out.println(calculator.calculate(1,2));
    }

    @Test
    public void testMultiply(){
        ICalculator calculator = new Multiply();
        System.out.println(calculator.calculate(1,2));
    }

    @Test
    public void testDivide(){
        ICalculator calculator = new Divide();
        System.out.println(calculator.calculate(1,2));
    }
}
