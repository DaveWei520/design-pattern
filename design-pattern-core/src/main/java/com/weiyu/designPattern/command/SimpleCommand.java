package com.weiyu.designPattern.command;

/**
 * @author weiyu@gomefinance.com.cn
 * @description
 * @create 2018/5/14 17:34
 * @since 1.0.0
 */
public class SimpleCommand implements Command {
    private Receiver receiver;

    public SimpleCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
