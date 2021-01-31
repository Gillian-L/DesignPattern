package Observer.entity;

import Observer.event.ShowEvent;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-10:05
 * @Description: Gillian_pro:Observer.entity
 * @Version: 1.0
 */
public class WCC extends FansObserver{
    @Override
    public boolean buytickets(ShowEvent e) {
        if (e.getSource() instanceof Twins) {
            System.out.println("confirm" + ((Twins) e.getSource()).getName() + e.getDate());
            return true;
        }
        else {
            System.out.println(e.getSource());
            return false;
        }

    }
}
