package willem.weiyu.designPattern.abstractFactory;

import willem.weiyu.designPattern.abstractFactory.IFruit;

public class Pear implements IFruit {
    @Override
    public void product() {
        System.out.println("======生产梨");
    }
}
