package willem.weiyu.designPattern.proxy;

/**
 * @author weiyu
 * @description
 * @create 2018/5/4 16:07
 * @since 1.0.0
 */
public class Subject implements ISubject {

    @Override
    public void visit() {
        System.out.println("======hello");
    }
}
