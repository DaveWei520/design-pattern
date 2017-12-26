package com.weiyu.factory.demo;

import com.weiyu.templateMethod.AbstractCalculator;
import com.weiyu.templateMethod.Plus;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class TemplateMethodTest {
    @Test
    public void templateMethodTest(){
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
