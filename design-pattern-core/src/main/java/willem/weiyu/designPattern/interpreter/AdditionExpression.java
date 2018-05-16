package willem.weiyu.designPattern.interpreter;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:31
 * @since 1.0.0
 */
public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(ArithmeticExpression mArithmeticExpression1, ArithmeticExpression mArithmeticExpression2) {
        super(mArithmeticExpression1, mArithmeticExpression2);
    }

    @Override
    public int interpret() {
        return mArithmeticExpression1.interpret()+mArithmeticExpression2.interpret();
    }
}
