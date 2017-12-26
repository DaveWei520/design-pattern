package com.weiyu.factory.demo;

import com.weiyu.builder.Builder;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class BuilderTest {
    @Test
    public void builderTest(){
        Builder builder = new Builder();
        builder.produceSmsSender(10);
    }
}
