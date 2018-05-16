package willem.weiyu.designPattern.decorator;

/**
 * @author weiyu
 * @description
 * @create 2017/6/26
 */
public class Sourceable implements Source {

    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
