package willem.weiyu.designPattern.interpreter;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:29
 * @since 1.0.0
 */
public abstract class OperatorExpression implements ArithmeticExpression{
    protected ArithmeticExpression mArithmeticExpression1,mArithmeticExpression2;

    public OperatorExpression(ArithmeticExpression mArithmeticExpression1, ArithmeticExpression mArithmeticExpression2) {
        this.mArithmeticExpression1 = mArithmeticExpression1;
        this.mArithmeticExpression2 = mArithmeticExpression2;
    }
}
