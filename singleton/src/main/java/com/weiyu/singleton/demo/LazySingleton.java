package com.weiyu.singleton.demo;

/**
 * @author weiyu
 * @description 单例模式（懒汉）
 * @create 2017/6/23
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    //私有化构造器
    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        synchronized (instance){
            if (instance == null)
                instance = new LazySingleton();
        }
        return instance;
    }
}
