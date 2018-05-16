package willem.weiyu.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author weiyu
 * @description
 * @create 2018/5/4 17:19
 * @since 1.0.0
 */
public class SellFishProxy<T extends SellFish> implements InvocationHandler {
    private T object;

    public T getInstance(T object){
        this.object = object;
        Class clazz = object.getClass();
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object,args);
    }
}
