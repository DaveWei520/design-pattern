package com.weiyu.factory.demo;

import com.weiyu.proxy.Proxy;
import com.weiyu.proxy.Sourceable;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class ProxyTest {
    @Test
    public void proxyTest(){
        Sourceable source = new Proxy();
        source.method();
    }
}
