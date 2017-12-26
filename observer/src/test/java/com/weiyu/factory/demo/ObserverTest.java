package com.weiyu.factory.demo;

import com.weiyu.observer.MySubject;
import com.weiyu.observer.Observer1;
import com.weiyu.observer.Observer2;
import com.weiyu.observer.Subject;
import org.junit.Test;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public class ObserverTest {
    @Test
    public void observerTest(){
        Subject subject = new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}
