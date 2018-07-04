package willem.weiyu.designPattern.memento;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 9:52
 * @since 1.0.0
 */
public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
