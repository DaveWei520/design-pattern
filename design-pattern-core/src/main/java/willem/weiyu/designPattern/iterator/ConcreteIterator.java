package willem.weiyu.designPattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyu
 * @description
 * @create 2018/5/14 16:38
 * @since 1.0.0
 */
public class ConcreteIterator<T> implements MyIterator<T> {
    private List<T> list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List<T> list){
        this.list = list;
    }

    @Override
    public T next() {
        T object = null;
        if (this.hasNext())
            object = this.list.get(cursor++);
        return object;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size())
            return false;
        return true;
    }
}
