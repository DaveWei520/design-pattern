package willem.weiyu.designPattern.state;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:04
 * @since 1.0.0
 */
public class StateClient {

    @Test
    public void test(){
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
