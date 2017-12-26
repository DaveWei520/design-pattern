package com.weiyu.factory.demo;

import com.weiyu.decorator.Decorator;
import com.weiyu.decorator.Source;
import com.weiyu.decorator.Sourceable;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class DecoratorTest {
    @Test
    public void decoratorTest(){
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
