package com.weiyu.command.demo;

/**
 * @author weiyu
 * 将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，
 * 对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能
 * @description 命令模式
 * @create 2018/01/22
 */
class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}

abstract class Command{
    public abstract void execute();
}

class ConcreteCommand extends Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}

class Receiver {
    public void doSomething(){
        System.out.println("接受者-业务逻辑处理");
    }
}

public class CommandClient {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        //客户端直接执行具体命令方式
        command.execute();

        //客户端通过调用者来执行命令
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }
}
