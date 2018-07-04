package willem.weiyu.designPattern.builder;

/**
 * @author weiyu
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * @description 抽象工厂模式
 * @create 2017/12/26
 */
public class PeopleBuilder {
    private String name;
    private String sex;
    private String idCard;
    private String birthday;
    private int age;
    private double height;
    private double weight;
    private String mobile;
    private String hometown;

    private PeopleBuilder(){

    }

    public static PeopleBuilder getDefaultBuilder(){
        return new PeopleBuilder();
    }

    public PeopleBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PeopleBuilder setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public PeopleBuilder setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }

    public PeopleBuilder setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public PeopleBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PeopleBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public PeopleBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public PeopleBuilder setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public PeopleBuilder setHometown(String hometown) {
        this.hometown = hometown;
        return this;
    }

    public People build(){
        return new People(this.name,this.sex,this.idCard,this.birthday,this.age,this.height,this.weight,this.mobile,this.hometown);
    }
}
