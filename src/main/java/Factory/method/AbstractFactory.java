package Factory.method;

import Factory.entity.Vehicle;
import Factory.entity.Weapon;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-9:50
 * @Description:
 * @Version: 1.0
 */
public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();
    public abstract Weapon createWeapon();
}
