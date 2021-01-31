package Observer.event;

import java.util.Date;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-9:41
 * @Description: Gillian_pro:Observer.event
 * @Version: 1.0
 */
public  class ShowEvent<T> extends FansEvent {
    Date date;
    String location;
    T source;

    public ShowEvent(Date date, String location, T source) {
        this.date = date;
        this.location = location;
        this.source = source;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
    @Override
    public T getSource() {
        return source;
    }
}
