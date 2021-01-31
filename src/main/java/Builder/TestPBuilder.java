package Builder;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-16:59
 * @Description: Gillian_pro:Builder
 * @Version: 1.0
 */
public class TestPBuilder {
    public static void main(String[] args) {
        Persion.Location location = new Persion.Location("是对的","hhf3455");
        Persion persion = new Persion.PersionBuilder().createBasic("3201", "jam", 0, 18)
                .createLocation(location)
                .builder();
        System.out.println(persion);

    }
}
