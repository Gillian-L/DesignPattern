package Visitor.demo;

import Visitor.entity.Visitor;
import Visitor.entity.Web_Msb;

/**
 * @Author: Gillian
 * @Date: 2020/11/17-15:17
 * @Description: Gillian_pro:Visitor.demo
 * @Version: 1.0
 */
public class TestVisitor {
    public static void main(String[] args) {
        Web_Msb web = new Web_Msb();
        Visitor visitor = new Visitor();
        Visitor.Vip vip = visitor.new Vip();
        web.accept(visitor);
        System.out.println("------------");
        web.accept(vip);
    }
}
