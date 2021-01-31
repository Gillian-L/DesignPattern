package Composite.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/24-9:06
 * @Description: Gillian_pro:Composite.entity
 * @Version: 1.0
 */
public class LeafNode extends Node{

    public LeafNode(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("leaf: " + super.getName());
    }

    @Override
   public void print(int index) {
        System.out.print(index+" ");
        for (int i = 0; i <index ; i++) {
            System.out.print("-");
        }
        this.printName();
    }
}
