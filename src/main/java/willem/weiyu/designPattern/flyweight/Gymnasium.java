package willem.weiyu.designPattern.flyweight;

/**
 * @author weiyu
 * @description
 * @create 2018/5/11 11:39
 * @since 1.0.0
 */
public class Gymnasium implements Building {
    private String name;
    private String activity;

    public Gymnasium(String activity){
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public void introduce() {
        System.out.println("该体育馆名称为："+name+",用来进行："+activity);
    }
}
