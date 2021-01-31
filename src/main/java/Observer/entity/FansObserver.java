package Observer.entity;

import Observer.event.ShowEvent;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-9:52
 * @Description: Gillian_pro:Observer.entity
 * @Version: 1.0
 */
public abstract class FansObserver {
    public abstract boolean buytickets(ShowEvent e);
}
