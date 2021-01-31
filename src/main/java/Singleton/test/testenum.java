package Singleton.test;

import Singleton.EnumS;

/**
 * @Author: Gillian
 * @Date: 2020/10/28-16:51
 * @Description:
 * @Version: 1.0
 */
public class testenum {
    public static void main(String[] args) {
     /*for (int i = 0; i < 30; i++) {
        new Thread(()->{
            System.out.println(EnumS.instance.hashCode());
        }).start();
    }*/
        EnumS a = EnumS.instance;
        System.out.println(a.i+a.toString()+a.hashCode());
        EnumS b = EnumS.instance;
        System.out.println(b.i+b.toString()+b.hashCode());
        a.i++;
        System.out.println(b.i+b.toString()+b.hashCode());

    }
}
