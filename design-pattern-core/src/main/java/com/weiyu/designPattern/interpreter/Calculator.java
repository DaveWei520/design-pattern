package com.weiyu.designPattern.interpreter;

import java.util.Stack;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:33
 * @since 1.0.0
 */
public class Calculator {
    protected Stack<ArithmeticExpression> mArithmeticExpressionStack = new Stack<>();

    public Calculator(String expression) {
        ArithmeticExpression arithmeticExpression1, arithmeticExpression2;
        String[] elements = expression.split(" ");
        for (int i = 0; i < elements.length; ++i) {
            switch (elements[i].charAt(0)) {
                case '+':
                    arithmeticExpression1 = mArithmeticExpressionStack.pop();
                    arithmeticExpression2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mArithmeticExpressionStack.push(
                            new AdditionExpression(arithmeticExpression1, arithmeticExpression2));
                    break;
                default:
                    mArithmeticExpressionStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate() {
        return mArithmeticExpressionStack.pop().interpret();
    }
}
