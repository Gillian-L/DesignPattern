package Strategy;

/**
 * @Author: Gillian
 * @Date: 2020/11/2-8:58
 * @Description:
 * @Version: 1.0
 */
public class Cat extends Pet{
    private int wt;
    private int ht;

    public Cat(int wt, int ht, int ft) {
        super(ft);
        this.wt = wt;
        this.ht = ht;
    }

    @Override
    public int getFt() {
        return super.getFt();
    }

    public int getWt() {
        return wt;
    }

    public int getHt() {
        return ht;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "wt=" + wt +
                ", ht=" + ht +
                '}';
    }
}
