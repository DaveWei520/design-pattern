package com.weiyu.designPattern.templateMethod;

import org.junit.Test;

/**
 * @author weiyu@gomefinance.com.cn
 * @description
 * @create 2018/5/14 15:37
 * @since 1.0.0
 */
public class templateMethodClient {

    @Test
    public void test(){
        AbstractSort sort = new BubbleSort();
        sort.printResult(new int[]{10, 32, 1, 9, 5, 7, 12, 0, 4, 3});
    }
}
