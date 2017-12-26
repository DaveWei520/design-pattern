package com.weiyu.factory.demo;

import com.weiyu.adapter.*;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class AdapterTest {
    @Test
    public void AdapterTest(){
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

    @Test
    public void WrapperTest(){
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }

    @Test
    public void Wrapper2Test(){
        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();

        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();
    }
}
