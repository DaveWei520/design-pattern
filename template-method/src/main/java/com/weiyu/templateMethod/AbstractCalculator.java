package com.weiyu.templateMethod;

/**
 * @author weiyu@gomeholdings.com
 * @description
 * @create 2017/6/26
 */
public abstract class AbstractCalculator {
    /*主方法，实现对本类其他方法的调用*/
    public final int calculate(String exp, String opt){
        int[] array = split(exp, opt);
        return calculate(array[0], array[1]);
    }

    public abstract int calculate(int num1, int num2);

    public int[] split(String exp, String opt){
        String[] array = exp.split(opt);
        int[] arrayInt = new int[]{Integer.parseInt(array[0]),Integer.parseInt(array[1])};
        return arrayInt;
    }
}
