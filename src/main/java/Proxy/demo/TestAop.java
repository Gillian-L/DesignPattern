package Proxy.demo;

import Proxy.entity.Movable;
import Proxy.entity.Tank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-15:05
 * @Description:
 * @Version: 1.0
 */
public class TestAop {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("Design_pattern/src/main/resources/SpringIoc.xml");
        Movable tank = (Tank) context.getBean("tank");
        tank.move();
    }
}
