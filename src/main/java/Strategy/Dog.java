package Strategy;

/**
 * @Author: Gillian
 * @Date: 2020/11/2-9:00
 * @Description:
 * @Version: 1.0
 */
public class Dog extends Pet{
   // private int ft;

    public Dog(int ft) {
        super(ft);
       // this.ft = ft;
      //  Comparator
    }

    @Override
    public int getFt() {
        return super.getFt();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "ft=" + super.getFt() +
                '}';
    }
}
