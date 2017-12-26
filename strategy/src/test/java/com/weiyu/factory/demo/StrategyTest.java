package com.weiyu.factory.demo;

import com.weiyu.strategy.ICalculator;
import com.weiyu.strategy.Plus;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class StrategyTest {
    @Test
    public void strategyTest(){
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}
