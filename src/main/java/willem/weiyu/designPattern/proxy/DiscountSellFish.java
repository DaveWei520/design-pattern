package willem.weiyu.designPattern.proxy;

/**
 * @author weiyu
 * @description
 * @create 2018/5/4 17:18
 * @since 1.0.0
 */
public class DiscountSellFish implements SellFish {
    @Override
    public void sell() {
        System.out.println("======卖鱼，打折价");
    }
}
