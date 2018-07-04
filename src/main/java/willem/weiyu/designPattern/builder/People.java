package willem.weiyu.designPattern.builder;

public class People {
    private String name;
    private String sex;
    private String idCard;
    private String birthday;
    private int age;
    private double height;
    private double weight;
    private String mobile;
    private String hometown;

    private People(){

    }

    public People(String name, String sex, String idCard, String birthday, int age, double height, double weight, String mobile, String hometown) {
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.birthday = birthday;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.mobile = mobile;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", mobile='" + mobile + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }


}
