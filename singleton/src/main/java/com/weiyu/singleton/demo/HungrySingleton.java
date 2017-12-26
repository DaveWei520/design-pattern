package com.weiyu.singleton.demo;

/**
 * @author weiyu
 * @description 单例模式（饿汉）
 * @create 2017/6/23
 */
public class HungrySingleton {
    //私有静态实例，防止被引用
    private static HungrySingleton instance = new HungrySingleton();

    //私有构造方法，防止被实例化
    private HungrySingleton(){

    }

    //静态工厂方法，创建实例
    public static HungrySingleton getInstance(){
        return instance;
    }
}
