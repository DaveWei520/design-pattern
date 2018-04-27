package com.weiyu.designPattern.singleton;

import org.junit.Test;

public class SingletonClient {

    @Test
    public void testHungrySingleton() {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Thread.currentThread().getName() + "  ======  " + HungrySingleton.getInstance())
            ).start();
        }
    }

    @Test
    public void testLazySingleton() {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Thread.currentThread() + "  ======  " + LazySingleton.getInstance())
            ).start();
        }
    }
}
