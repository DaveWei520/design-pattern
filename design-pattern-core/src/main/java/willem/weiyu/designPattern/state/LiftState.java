package willem.weiyu.designPattern.state;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:15
 * @since 1.0.0
 */
public abstract class LiftState implements ILift{
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
}
