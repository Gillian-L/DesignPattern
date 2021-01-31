package Singleton.test;

import Singleton.Inner;

/**
 * @Author: Gillian
 * @Date: 2020/10/28-16:10
 * @Description:
 * @Version: 1.0
 */
public class testinner {

    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                System.out.println(Inner.getinstance().hashCode());
            }).start();
        }
    }

}


