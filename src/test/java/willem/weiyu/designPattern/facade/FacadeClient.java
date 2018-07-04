package willem.weiyu.designPattern.facade;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/11 10:09
 * @since 1.0.0
 */
public class FacadeClient {
    @Test
    public void test() {
        Computer computer = new Computer();
        computer.startup();
        System.out.println("======");
        computer.shutdown();
    }
}
