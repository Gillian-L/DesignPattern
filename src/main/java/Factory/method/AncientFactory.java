package Factory.method;

import Factory.entity.Carriage;
import Factory.entity.Sword;
import Factory.entity.Vehicle;
import Factory.entity.Weapon;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-10:37
 * @Description:
 * @Version: 1.0
 */
public class AncientFactory extends AbstractFactory{

    public AncientFactory() {
    }

    @Override
    public Vehicle createVehicle() {
        return new Carriage();
    }

    @Override
    public Weapon createWeapon() {
        return new Sword();
    }
}
