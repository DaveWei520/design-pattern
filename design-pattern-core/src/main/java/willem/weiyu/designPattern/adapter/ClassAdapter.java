package willem.weiyu.designPattern.adapter;

/**
 * @author weiyu
 * @description 类适配器，通过继承来实现适配器功能
 * @create 2018/5/3 9:53
 * @since 1.0.0
 */
public class ClassAdapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        isUsb();
    }
}

