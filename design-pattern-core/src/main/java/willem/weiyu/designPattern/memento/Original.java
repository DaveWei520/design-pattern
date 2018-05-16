package willem.weiyu.designPattern.memento;

/**
 * @author weiyu
 * @description
 * @create 2018/5/15 9:48
 * @since 1.0.0
 */
public class Original {
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
