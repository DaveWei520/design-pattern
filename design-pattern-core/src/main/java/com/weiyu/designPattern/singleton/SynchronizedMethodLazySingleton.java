package com.weiyu.designPattern.singleton;

/**
 * @author weiyu
 * 确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * @description 单例模式（懒汉），线程安全，方法同步
 * @create 2017/6/23
 */
public class SynchronizedMethodLazySingleton {
    private static SynchronizedMethodLazySingleton instance;

    private SynchronizedMethodLazySingleton(){

    }

    public static synchronized SynchronizedMethodLazySingleton getInstance(){
        if (instance == null)
            instance = new SynchronizedMethodLazySingleton();
        return instance;
    }
}
