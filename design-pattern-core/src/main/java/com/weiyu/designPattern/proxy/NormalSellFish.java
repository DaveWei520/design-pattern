package com.weiyu.designPattern.proxy;

/**
 * @author weiyu@gomefinance.com.cn
 * @description
 * @create 2018/5/4 17:18
 * @since 1.0.0
 */
public class NormalSellFish implements SellFish {
    @Override
    public void sell() {
        System.out.println("======卖鱼，正常价");
    }
}
