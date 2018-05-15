package com.weiyu.designPattern.state;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:17
 * @since 1.0.0
 */
public class StoppingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        //do nothing;
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
