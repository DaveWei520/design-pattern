package com.weiyu.designPattern.memento;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 9:53
 * @since 1.0.0
 */
public class MementoClient {

    @Test
    public void test(){
        Original original = new Original("original value");

        Storage storage = new Storage(original.createMemento());

        System.out.println("======初始化状态为："+original.getValue());
        original.setValue("new value");
        System.out.println("======修改后状态为："+original.getValue());

        original.restoreMemento(storage.getMemento());
        System.out.println("======恢复后状态为："+original.getValue());
    }
}
