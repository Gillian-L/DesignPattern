package Proxy.entity;

import java.util.Random;

/**
 * @Author: Gillian
 * @Date: 2020/10/22-9:29
 * @Description:
 * @Version: 1.0
 */

    public class Tank implements Movable{
       int i;
        @Override
        public void move() {
            //  long start = System.currentTimeMillis();
            System.out.println("----------");
            try {
                Thread.sleep(new Random().nextInt(10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long end = System.currentTimeMillis();
            //  System.out.println(end-start);
        }

        public static void main(String[] args) {
            new Tank().move();
        }

    }

