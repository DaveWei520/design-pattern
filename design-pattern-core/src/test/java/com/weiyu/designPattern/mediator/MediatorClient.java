package com.weiyu.designPattern.mediator;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:13
 * @since 1.0.0
 */
public class MediatorClient {

    @Test
    public void test(){
        AbstractColleague colleagueA = new ColleagueA();
        AbstractColleague colleagueB = new ColleagueB();

        Mediator mediator = new Mediator(colleagueA,colleagueB);
        colleagueA.setMediator(mediator);
        colleagueB.setMediator(mediator);

        ((ColleagueA) colleagueA).notifyColleagueB();
        ((ColleagueB) colleagueB).notifyColleagueA();
    }
}
