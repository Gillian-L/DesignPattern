package Factory.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-9:17
 * @Description:
 * @Version: 1.0
 */
public class Car extends Vehicle{

    public Car() {
        System.out.println("car");
    }

    public void drive(){
        System.out.println("car-----");
    }
}
