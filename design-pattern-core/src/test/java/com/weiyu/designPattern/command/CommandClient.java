package com.weiyu.designPattern.command;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 17:28
 * @since 1.0.0
 */
public class CommandClient {

    @Test
    public void test(){
        Receiver receiver = new Receiver();
        Command command = new SimpleCommand(receiver);
        //客户端直接执行具体命令方式
        command.execute();

        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker(command);
        invoker.action();
    }
}
