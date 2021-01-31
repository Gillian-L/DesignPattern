package Singleton.test;

import Singleton.DCLS;

/**
 * @Author: Gillian
 * @Date: 2020/10/27-17:09
 * @Description:
 * @Version: 1.0
 */
public class testdcl {
    public volatile static DCLS dcls;
    public static void main(String[] args) {
       // System.out.println(new DCLS().hashCode());
        for (int i = 0; i < 30; i++) {
        new Thread(()->{
                System.out.println(DCLS.getInstance().hashCode());
        }).start();
        }
//        while(true){}
    }

   /* public static  DCLS getdcl(){
        if (dcls==null){
            synchronized (DCLS.class) {
                if (dcls==null) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return dcls = DCLS.getInstance();
                }
            }
        }
            return dcls;
    }*/

}
