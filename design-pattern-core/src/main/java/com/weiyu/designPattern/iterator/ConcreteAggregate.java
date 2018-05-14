package com.weiyu.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 16:40
 * @since 1.0.0
 */
public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList();

    @Override
    public void add(T object) {
        list.add(object);
    }

    @Override
    public void remove(T object) {
        list.remove(object);
    }

    @Override
    public MyIterator<T> iterator() {
        return new ConcreteIterator<T>(list);
    }
}
