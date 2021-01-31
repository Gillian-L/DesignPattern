package Visitor.ASM.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Gillian
 * @Date: 2020/11/19-15:34
 * @Description: Gillian_pro:Visitor.ASM.test
 * @Version: 1.0
 */
public class LoaderTest {
    public static void main(String[] args) {
        MyClassLoader loader = new MyClassLoader();
        try {
            Class<?> tank = loader.loadClass("TestL");
            Class<?> tank1 = loader.loadClass("java.lang.String");
            try {
                System.out.println(tank);
                //TestL o = (TestL) tank.newInstance();
                Object o = tank.newInstance();
                try {
                    Constructor<?> sc1 = tank1.getConstructor(String.class);
                    try {
                        String s = (String) sc1.newInstance("woshizhu");
                        System.out.println(s);
                        System.out.println(s.getClass().getClassLoader());
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                }
                //String s = (String) tank1.newInstance();
                System.out.println(o);
                System.out.println(o.getClass().getClassLoader());

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
