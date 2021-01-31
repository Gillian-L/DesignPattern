package Proxy.demo;

import Proxy.entity.Movable;
import Proxy.entity.Tank;

/**
 * @Author: Gillian
 * @Date: 2020/10/22-9:34
 * @Description:
 * @Version: 1.0
 */
public class TankTimeProxy implements Movable {
    private Tank tank;

    public static void main(String[] args) {
        new TankTimeProxy(new Tank()).move();
    }


    public TankTimeProxy(Tank tank){
        this.tank= tank;
    }
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        // tank = new Tank();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }

}
