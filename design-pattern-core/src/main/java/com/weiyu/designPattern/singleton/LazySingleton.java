package com.weiyu.designPattern.singleton;

/**
 * @author weiyu
 * 确保一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * @description 单例模式（懒汉），非线程安全
 * @create 2017/6/23
 */
public class LazySingleton {
    private static LazySingleton instance;

    //私有化构造器
    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
