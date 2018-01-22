package com.weiyu.iterator.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyu
 * 提供一种方法访问一个容器对象中各个元素，而又不暴露该对象的内部细节
 * @description 迭代器模式
 * @type 行为类模式
 * @create 2018/01/22
 */
interface Iterator<T> {
    T next();
    boolean hasNext();
}

class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List<T> list){
        this.list = list;
    }

    @Override
    public T next() {
        T object = null;
        if (this.hasNext()){
            object = this.list.get(cursor++);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size()){
            return false;
        }
        return true;
    }
}

interface Aggregate<T> {
    void add(T object);
    void remove(T object);
    Iterator<T> iterator();
}

class ConcreteAggregate<T> implements Aggregate<T>{
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
    public Iterator<T> iterator() {
        return new ConcreteIterator(list);
    }
}

public class IteratorClient {

    public static void main(String[] args) {
        Aggregate<String> ag = new ConcreteAggregate();
        ag.add("小明");
        ag.add("小红");
        ag.add("小刚");
        Iterator<String> it = ag.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
