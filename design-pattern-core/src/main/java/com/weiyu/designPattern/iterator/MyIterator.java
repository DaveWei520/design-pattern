package com.weiyu.designPattern.iterator;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 16:33
 * @since 1.0.0
 */
public interface MyIterator<T> {
    T next();
    boolean hasNext();
}
