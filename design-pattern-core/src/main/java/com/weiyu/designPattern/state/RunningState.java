package com.weiyu.designPattern.state;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:17
 * @since 1.0.0
 */
public class RunningState extends LiftState {

    @Override
    public void open() {
        //do nothing;
    }

    @Override
    public void close() {
        //do nothing;
    }

    @Override
    public void run() {
        System.out.println("电梯上下跑。。。");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }
}
