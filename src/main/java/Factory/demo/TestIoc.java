package Factory.demo;

import Factory.entity.Vehicle;
import Factory.method.AncientFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-13:48
 * @Description:
 * @Version: 1.0
 */
public class TestIoc {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("Design_pattern/src/main/resources/SpringIoc.xml");
        AncientFactory ancientbean = (AncientFactory) context.getBean("ancient");
        Vehicle vehicle = ancientbean.createVehicle();
        System.out.println(vehicle.hashCode());
        vehicle.drive();
        System.out.println("-----");
        Vehicle vehicle1 = ancientbean.createVehicle();
        System.out.println(vehicle1.hashCode());
        vehicle1.drive();
    }
}
