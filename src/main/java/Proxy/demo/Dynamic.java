package Proxy.demo;

import Proxy.entity.Movable;
import Proxy.entity.Tank;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: Gillian
 * @Date: 2020/10/23-9:16
 * @Description:
 * @Version: 1.0
 */
public class Dynamic {
    public static void main(String[] args) {
//        Tank tank = new Tank();
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new LogHandler(new NewTimeProxy(new Tank()))
        );
        System.out.println(m.getClass().getName());
        m.move();
    }

}

    class LogHandler implements InvocationHandler{
//        private Tank tank;
        private Object abs_tank;

        public LogHandler(Object tank) {
            this.abs_tank = tank;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName() + "hhh");
           // Object o = method.invoke(abs_tank, args);
            System.out.println(method.getName() + "ggg");
            return null;
        }
    }



