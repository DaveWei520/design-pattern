package willem.weiyu.designPattern.mediator;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 11:08
 * @since 1.0.0
 */
public class ColleagueA extends AbstractColleague {

    public void notifyColleagueB() {
        mediator.notifyColleagueB();
    }

    @Override
    public void operate() {
        System.out.println("this is ColleagueB's operation");
    }
}
