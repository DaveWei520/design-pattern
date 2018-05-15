package com.weiyu.designPattern.mediator;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:11
 * @since 1.0.0
 */
public class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
        super(colleagueA, colleagueB);
    }

    @Override
    public void notifyColleagueA() {
        if (colleagueA != null)
            colleagueA.operate();
    }

    @Override
    public void notifyColleagueB() {
        if (colleagueB != null)
            colleagueB.operate();
    }
}
