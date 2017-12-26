package com.weiyu.factory.demo;

import com.weiyu.facade.Computer;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class FacadeTest {
    @Test
    public void facadeTest(){
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
