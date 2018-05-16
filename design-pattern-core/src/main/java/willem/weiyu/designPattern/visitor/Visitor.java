package willem.weiyu.designPattern.visitor;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 10:53
 * @since 1.0.0
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(IElement element) {
        element.doSomething();
    }
}
