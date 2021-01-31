package Singleton;

/**
 * @Author: Gillian
 * @Date: 2020/10/28-16:48
 * @Description:
 * @Version: 1.0
 */
public enum EnumS {
    instance;
    public static String s ="hhh";
    public int i;
    public void m(){
        System.out.println("" + this + this.hashCode());
    }
}
