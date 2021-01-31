package Factory.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-9:26
 * @Description:
 * @Version: 1.0
 */
public class Carbine extends Weapon{
    public Carbine() {
        System.out.println("carbine");
    }

    public void shot(){
        System.out.println("carbine-------");
    }
}
