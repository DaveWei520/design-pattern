package willem.weiyu.designPattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyu
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 * @description 原型模式
 * @create 2017/12/26
 */
class Prototype implements Cloneable {
    private String name;
    private String type;
    private ArrayList<String> elemList = new ArrayList<>();
    private Person person = new Person();

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<String> getElemList() {
        return elemList;
    }

    public void setElemList(String elem) {
        this.elemList.add(elem);
    }

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
            //浅拷贝
            prototype = (Prototype) super.clone();
            //深拷贝
            //prototype.elemList = (ArrayList<String>) this.elemList.clone();
            //prototype.person = (Person) this.person.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}

class Person implements Cloneable{
    private String name;
    //0男，1女
    private int sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
