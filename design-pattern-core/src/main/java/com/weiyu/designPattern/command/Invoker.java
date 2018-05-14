package com.weiyu.designPattern.command;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 17:33
 * @since 1.0.0
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
