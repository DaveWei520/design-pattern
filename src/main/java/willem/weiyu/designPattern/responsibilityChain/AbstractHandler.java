package willem.weiyu.designPattern.responsibilityChain;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 17:18
 * @since 1.0.0
 */
public abstract class AbstractHandler implements Handler{
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler){
        this.handler = handler;
    }
}
