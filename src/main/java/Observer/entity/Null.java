package Observer.entity;

import Observer.event.ShowEvent;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-10:37
 * @Description: Gillian_pro:Observer.entity
 * @Version: 1.0
 */
public class Null extends FansObserver{

    @Override
    public boolean buytickets(ShowEvent e) {
        System.out.println("reserve plane to" + e.getLocation());
        return true;
    }
}
