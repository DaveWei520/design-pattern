package willem.weiyu.designPattern.prototype;

import org.junit.Test;

public class PrototypeClient {

    @Test
    public void test() {
        Prototype object = new Prototype();
        object.setName("clone");
        object.setElemList("first");
        object.getPerson().setName("zhangsan");
        System.out.println(object + "原对象======name：" + object.getName());
        System.out.println(object+ "原对象======element：" + object.getElemList());
        System.out.println(object+ "原对象======person：" + object.getPerson().getName());

        Prototype clone = object.clone();
        clone.setName("newClone");
        clone.setElemList("second");
        clone.getPerson().setName("lisi");
        System.out.println(clone + "拷贝对象======name：" + clone.getName());
        System.out.println(clone + "拷贝对象======element：" + clone.getElemList());
        System.out.println(clone + "拷贝对象======element：" + clone.getPerson().getName());
    }
}
