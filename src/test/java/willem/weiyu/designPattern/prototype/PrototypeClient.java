package willem.weiyu.designPattern.prototype;

import org.junit.Test;

public class PrototypeClient {

    @Test
    public void test() {
        Prototype object = new Prototype();
        object.setName("clone");
        for (int i = 0; i < 10; i++){
            Prototype clone = object.clone();
            System.out.println(clone+"======name:"+clone.getName());
        }
    }
}
