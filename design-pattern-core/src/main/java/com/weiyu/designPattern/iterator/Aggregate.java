package com.weiyu.designPattern.iterator;

public interface Aggregate<T> {
    void add(T object);
    void remove(T object);
    MyIterator<T> iterator();
}
