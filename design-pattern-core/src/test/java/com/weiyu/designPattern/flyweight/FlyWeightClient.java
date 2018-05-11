package com.weiyu.designPattern.flyweight;

import org.junit.Test;

/**
 * @author weiyu@gomefinance.com.cn
 * @description
 * @create 2018/5/11 13:26
 * @since 1.0.0
 */
public class FlyWeightClient {

    @Test
    public void test(){
        String activity = "soccer";
        for (int i = 0; i < 5; i++){
            Gymnasium building = BuildingFactory.getBuilding(activity);
            building.setName("足球场");
            building.introduce();
            System.out.println("对象池中对象数量为："+BuildingFactory.getSize());
        }
    }
}
