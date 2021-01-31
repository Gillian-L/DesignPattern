package Proxy.demo.cglib;

import Factory.method.ModernFactory;
import Proxy.entity.Movable;
import Proxy.entity.Tank;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: Gillian
 * @Date: 2020/11/5-10:56
 * @Description:
 * @Version: 1.0
 */
public class Cgproxy {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(Tank.class);
        //设置回调函数
        enhancer.setCallback(new MethodInterceptor(){
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) {
                System.out.println("这里是对目标类进行增强！！！");
                //注意这里的方法调用，不是用反射哦！！！
                Object object = null;
                new ModernFactory().createWeapon();

                try {
                    object = proxy.invokeSuper(obj, args);
                } catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
                return object;
            }
        });
        /*enhancer.setCallback(new MethodInterceptor((Object obj, Method method, Object[] args, MethodProxy proxy) ->{
                    System.out.println("这里是对目标类进行增强！！！");
                    //注意这里的方法调用，不是用反射哦！！！
                    Object object = null;
                    new ModernFactory().createWeapon();
                    return object;
            })
        );*/

        Movable tank = (Movable) enhancer.create();
        tank.move();
    }
}
