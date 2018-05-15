package com.weiyu.designPattern.mediator;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:08
 * @since 1.0.0
 */
public class ColleagueB extends AbstractColleague {

    public void notifyColleagueA() {
        mediator.notifyColleagueA();
    }

    @Override
    public void operate() {
        System.out.println("this is ColleagueA's operation");
    }
}
