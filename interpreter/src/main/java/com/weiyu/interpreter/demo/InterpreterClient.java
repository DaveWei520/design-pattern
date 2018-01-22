package com.weiyu.interpreter.demo;

import java.util.Stack;

/**
 * @author weiyu
 * 给定一种语言，定义他的文法的一种表示，并定义一个解释器，该解释器使用该表示来解释语言中句子
 * @description 解释器模式
 * @type 行为类模式
 * @create 2018/01/22
 */
class Context{}

abstract class Expression {
    public abstract Object interpreter(Context ctx);
}

class TerminalExpression extends Expression {

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}

class NonterminalExpression extends Expression{

    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}

public class InterpreterClient {

    public static void main(String[] args) {
        String expression = "";
        char[] charArray = expression.toCharArray();
        Context ctx = new Context();
        Stack<Expression> stack = new Stack<>();
        for (int i=0; i<charArray.length; i++){
            //进行语法判断，递归调用
        }
        Expression exp = stack.pop();
        exp.interpreter(ctx);
    }
}
