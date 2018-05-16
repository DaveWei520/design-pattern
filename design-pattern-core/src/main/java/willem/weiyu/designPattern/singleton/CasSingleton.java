package willem.weiyu.designPattern.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author weiyu
 * @description
 * @create 2018/5/4 18:03
 * @since 1.0.0
 */
public class CasSingleton {
    private static final AtomicReference<CasSingleton> INSTANCE = new AtomicReference<>();

    private CasSingleton(){

    }

    public static CasSingleton getInstance(){
        for (;;){
            CasSingleton instance = INSTANCE.get();
            if (instance != null)
                return instance;
            instance = new CasSingleton();
            if (INSTANCE.compareAndSet(null,instance))
                return instance;
        }
    }
}
