package willem.weiyu.designPattern.proxy;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/4 16:05
 * @since 1.0.0
 */
public class ProxyClient {
    @Test
    public void testStatic(){
        StaticProxy proxy = new StaticProxy(new Subject());
        proxy.visit();
    }

    @Test
    public void testDynamic(){
        ISubject instance = new DynamicProxy<Subject>().getInstance(new Subject());
        instance.visit();
    }

    @Test
    public void testSellFish(){
        SellFish instance1 = new SellFishProxy<NormalSellFish>().getInstance(new NormalSellFish());
        instance1.sell();
        SellFish instance2 = new SellFishProxy<DiscountSellFish>().getInstance(new DiscountSellFish());
        instance2.sell();
    }
}
