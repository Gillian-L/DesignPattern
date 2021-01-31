package Factory.demo;

import Factory.method.AbstractFactory;
import Factory.method.AncientFactory;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-10:40
 * @Description:
 * @Version: 1.0
 */
public class TestF {

    public static void main(String[] args) {
        AbstractFactory fc = new AncientFactory();
        fc.createVehicle().drive();
        fc.createWeapon().shot();
    }
}
