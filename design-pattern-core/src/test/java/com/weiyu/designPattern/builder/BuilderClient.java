package com.weiyu.designPattern.builder;

import org.junit.Test;

public class BuilderClient {

    @Test
    public void test() {
        Director director = new Director();

        Product product1 = director.getAProduct();
        product1.showProduct();

        Product product2 = director.getBProduct();
        product2.showProduct();
    }

    @Test
    public void test1(){
        People people = PeopleBuilder.getDefaultBuilder().setName("test").setAge(12).build();
        System.out.println(people);
    }
}
