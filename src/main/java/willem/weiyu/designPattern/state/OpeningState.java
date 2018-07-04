package willem.weiyu.designPattern.state;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:17
 * @since 1.0.0
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启。。。");
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.closeingState);
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        //do nothing;
    }

    @Override
    public void stop() {
        //do nothing;
    }
}
