package com.weiyu.builder.demo;

/**
 * @author weiyu
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * @description 抽象工厂模式
 * @create 2017/12/26
 */
class Product {
    private String name;
    private String type;

    public void showProduct(){
        System.out.println("名称："+name+"\n型号："+type);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class ConcreteBuilder extends Builder{
    private Product product = new Product();

    @Override
    public void setPart(String arg1, String arg2) {
        product.setName(arg1);
        product.setType(arg2);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

abstract class Builder {
    public abstract void setPart(String arg1, String arg2);
    public abstract Product getProduct();
}

class Director{
   private Builder builder = new ConcreteBuilder();

   public Product getAProduct(){
       builder.setPart("宝马","X7");
       return builder.getProduct();
   }

   public Product getBProduct(){
       builder.setPart("奥迪","Q5");
       return builder.getProduct();
   }
}

public class BuilderClient {

    public static void main(String[] args) {
        Director director = new Director();

        Product product1 = director.getAProduct();
        product1.showProduct();

        Product product2 = director.getBProduct();
        product2.showProduct();
    }
}
