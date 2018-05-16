package willem.weiyu.designPattern.decorator;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/3 10:30
 * @since 1.0.0
 */
public class DecoratorClient {

    @Test
    public void test(){
        new Decorator(new Sourceable()).method();
    }
}
