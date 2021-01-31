package Singleton.test;

import Singleton.Inner;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Gillian
 * @Date: 2020/10/28-17:12
 * @Description:
 * @Version: 1.0
 */
public class testreflect {
    public static void main(String[] args) {
        Inner o5 = Inner.getinstance();
        o5.m();
        try {
            Class inner = Inner.class;
            Constructor dic = inner.getDeclaredConstructor();
            dic.setAccessible(true);
            try {
                try {
                    Field field0 = inner.getDeclaredField("count");
                    field0.setAccessible(true);
                    field0.setInt(dic,0);
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
                Inner o = (Inner) dic.newInstance();
                o.m();
                try {
                    Field field = inner.getDeclaredField("count");
                    field.setAccessible(true);
                    field.setInt(dic,0);
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
                Inner o1 = (Inner) dic.newInstance();
                o1.m();
                System.out.println("" + o.hashCode() +"--" +o1.hashCode());
                System.out.println("--------------------");
                Inner o2 = Inner.getinstance();
                o2.m();
                Inner o3 = Inner.getinstance();
                o3.m();
                System.out.println("" + o2.hashCode() +"--"+ o3.hashCode());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
