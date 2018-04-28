package com.weiyu.designPattern.singleton;

import org.junit.Test;

public class SingletonClient {

    @Test
    public void testHungrySingleton() {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Thread.currentThread().getName() + "  ======  " + HungrySingleton.getInstance().hashCode())
            ).start();
        }
    }

    @Test
    public void testLazySingleton() {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Thread.currentThread() + "  ======  " + LazySingleton.getInstance().hashCode())
            ).start();
        }
    }

    @Test
    public void testSynchronizedMethodLazySingleton(){
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Thread.currentThread() + "  ======  " + SynchronizedMethodLazySingleton.getInstance().hashCode())
            ).start();
        }
    }

    @Test
    public void testSynchronizedCodeBlockLazySingleton(){
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Thread.currentThread() + "  ======  " + SynchronizedCodeBlockLazySingleton.getInstance().hashCode())
            ).start();
        }
    }

    @Test
    public void testDoubleCheckLazySingleton(){
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Thread.currentThread() + "  ======  " + DoubleCheckLazySingleton.getInstance().hashCode())
            ).start();
        }
    }
}
