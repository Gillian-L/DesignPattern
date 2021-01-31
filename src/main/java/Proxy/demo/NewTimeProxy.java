package Proxy.demo;

import Proxy.entity.Movable;
import Proxy.entity.Tank;

/**
 * @Author: Gillian
 * @Date: 2020/10/22-9:35
 * @Description:
 * @Version: 1.0
 */
public class NewTimeProxy implements Movable{
    private Movable abs_tank;

    public static void main(String[] args) {
        new LogProxy(new NewTimeProxy(new Tank())).move();
    }

    public NewTimeProxy(Movable tank){
        this.abs_tank=tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        // tank = new Tank();
        abs_tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

 class LogProxy implements Movable{
    private Movable abs_tank;

     public LogProxy(Movable tank){
         this.abs_tank=tank;
     }
    @Override
    public void move() {
        System.out.println("log-start");
        // tank = new Tank();
        abs_tank.move();
        System.out.println("log-end");
    }

}
