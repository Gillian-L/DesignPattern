package Factory.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/3-9:27
 * @Description:
 * @Version: 1.0
 */
public class Sword extends Weapon{
    public Sword() {
        System.out.println("sword");
    }
    @Override
    public void shot(){
        System.out.println("sword-------");
    }
}
