package willem.weiyu.designPattern.adapter;

import org.junit.Test;
import willem.weiyu.designPattern.adapter.IDraw;
import willem.weiyu.designPattern.adapter.InterfaceAdapter;
import willem.weiyu.designPattern.adapter.Ps2;
import willem.weiyu.designPattern.adapter.Usber;

/**
 * @author weiyu
 * @description 适配器模式测试类
 * @create 2018/5/3 9:56
 * @since 1.0.0
 */
public class AdapterClient {
    @Test
    public void testClassAdapter(){
        Ps2 p = new ClassAdapter();
        p.isPs2();
    }

    @Test
    public void testObjectAdapter(){
        Ps2 p = new ObjectAdapter(new Usber());
        p.isPs2();
    }

    @Test
    public void testInterfaceAdapter(){
        IDraw draw = new InterfaceAdapter();
        draw.drawCircle();
        draw.drawStar();
    }
}
