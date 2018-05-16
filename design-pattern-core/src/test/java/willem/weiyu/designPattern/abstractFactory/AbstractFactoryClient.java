package willem.weiyu.designPattern.abstractFactory;

import org.junit.Test;

public class AbstractFactoryClient {

    @Test
    public void test(){
        IFactory appleFactory = new AppleFactory();
        appleFactory.create().product();
        IFactory pearFactory = new PearFactory();
        pearFactory.create().product();
    }
}
