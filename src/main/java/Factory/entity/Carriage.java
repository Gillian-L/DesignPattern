package Factory.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-9:23
 * @Description:
 * @Version: 1.0
 */
public class Carriage extends Vehicle{
    public Carriage() {
        System.out.println("carriage");
    }
    @Override
    public void drive(){
        System.out.println("carriage-----");
    }
}
