package Observer.demo;

import Observer.entity.*;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-10:51
 * @Description: Gillian_pro:Observer.demo
 * @Version: 1.0
 */
public class TestObserver {

    public static void main(String[] args) {
       /* Twins twins = new Twins();
        twins.add(new WCC()).add(new GL()).add(new Null());
        twins.makeShow();*/
        Nancy twins = new Nancy();
        twins.add(new WCC()).add(new GL()).add(new Null());
        twins.makeShow();
    }
}
