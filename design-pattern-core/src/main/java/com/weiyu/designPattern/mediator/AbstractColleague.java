package com.weiyu.designPattern.mediator;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:04
 * @since 1.0.0
 */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract  void operate();
}
