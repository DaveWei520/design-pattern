package willem.weiyu.designPattern.strategy;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 15:21
 * @since 1.0.0
 */
public class Multiply implements ICalculator {

    @Override
    public float calculate(float arg1, float arg2) {
        return arg1 * arg2;
    }
}
