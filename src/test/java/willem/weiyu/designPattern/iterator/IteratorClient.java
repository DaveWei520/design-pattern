package willem.weiyu.designPattern.iterator;

import org.junit.Test;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 16:32
 * @since 1.0.0
 */
public class IteratorClient {

    @Test
    public void test(){
        Aggregate<String> ag = new ConcreteAggregate();
        ag.add("小明");
        ag.add("小红");
        ag.add("小刚");
        MyIterator<String> it = ag.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
