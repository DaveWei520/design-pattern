package willem.weiyu.designPattern.prototype;

/**
 * @author weiyu
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 * @description 原型模式
 * @create 2017/12/26
 */
class Prototype implements Cloneable {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}
