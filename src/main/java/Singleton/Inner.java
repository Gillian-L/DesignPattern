package Singleton;

/**
 * @Author: Gillian
 * @Date: 2020/10/28-9:14
 * @Description:
 * @Version: 1.0
 */
public class Inner {
    private static int count = 0;
    private Inner(){
        synchronized(this) {
            if (count > 0) {
                throw new RuntimeException("创建了两个实例");
            }
            count++;
        }
    };

    private  static class InnerHandler {
       private  static Inner inner = new Inner();


    }

    public static Inner getinstance(){
        return   InnerHandler.inner;
    }

    public void m(){
        System.out.println("" + this + this.hashCode());
    }

}
