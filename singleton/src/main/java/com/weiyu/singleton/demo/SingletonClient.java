package com.weiyu.singleton.demo;

public class SingletonClient {
    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstance());
        System.out.println("======");
        System.out.println(LazySingleton.getInstance());
    }
}
