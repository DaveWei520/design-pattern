package willem.weiyu.designPattern.mediator;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:05
 * @since 1.0.0
 */
public abstract class AbstractMediator {
    protected AbstractColleague colleagueA;
    protected AbstractColleague colleagueB;

    public AbstractMediator(AbstractColleague colleagueA, AbstractColleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }

    public abstract void notifyColleagueA();
    public abstract void notifyColleagueB();
}
