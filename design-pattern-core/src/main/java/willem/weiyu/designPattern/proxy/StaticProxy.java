package willem.weiyu.designPattern.proxy;

/**
 * @author weiyu
 * @description 代理模式,静态代理
 * @create 2017/6/26
 */
public class StaticProxy implements ISubject {
    private ISubject subject;

    public StaticProxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void visit() {
        subject.visit();
    }
}
