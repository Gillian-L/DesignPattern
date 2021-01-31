package Observer.entity;

import Observer.event.ShowEvent;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-9:53
 * @Description: Gillian_pro:Observer.entity
 * @Version: 1.0
 */
public class GL extends FansObserver {

    @Override
    public boolean buytickets(ShowEvent e) {
        System.out.println("GL " + "buy tickets " + e.getDate());
        return true;
    }
}
