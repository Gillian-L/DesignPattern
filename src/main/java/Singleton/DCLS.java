package Singleton;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Gillian
 * @Date: 2020/10/27-17:03
 * @Description:
 * @Version: 1.0
 */
public class DCLS {
    private volatile  static DCLS dcls;
    private DCLS(){

    };

    public static DCLS getInstance(){
        if (dcls==null){
            synchronized (DCLS.class) {
                if (dcls==null) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return dcls = new DCLS();
                }
            }
        }
        return dcls;
    }

    public void m(){
        System.out.println("" + this + this.hashCode());
    }
}
