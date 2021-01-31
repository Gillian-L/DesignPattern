package Observer.event;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-14:06
 * @Description: Gillian_pro:Observer.event
 * @Version: 1.0
 */
public abstract class FansEvent<T> {
    T source;

    public T getSource() {
        return source;
    }
}
