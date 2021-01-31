package Factory.method;

import Factory.entity.Car;
import Factory.entity.Carbine;
import Factory.entity.Vehicle;
import Factory.entity.Weapon;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-9:31
 * @Description:
 * @Version: 1.0
 */
public class ModernFactory extends AbstractFactory{
    public ModernFactory() {
    }

    public  Vehicle createVehicle(){
        Car car = new Car();
        return car;
    }
    @Override
    public Weapon createWeapon(){
        Carbine carbine = new Carbine();
        return carbine;
    }
}
