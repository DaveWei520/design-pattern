package com.weiyu.designPattern.singleton;

public class SynchronizedCodeBlockLazySingleton {
    private static SynchronizedCodeBlockLazySingleton instance;

    private SynchronizedCodeBlockLazySingleton(){

    }

    public static SynchronizedCodeBlockLazySingleton getInstance(){
        synchronized (SynchronizedCodeBlockLazySingleton.class){
            if (instance == null)
                instance = new SynchronizedCodeBlockLazySingleton();
        }
        return instance;
    }
}
