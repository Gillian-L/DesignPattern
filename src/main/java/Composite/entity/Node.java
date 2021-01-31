package Composite.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/24-9:03
 * @Description: Gillian_pro:Composite.entity
 * @Version: 1.0
 */
public abstract class Node {
    private String name;

    public String getName() {
        return name;
    }

    public Node(String name) {
        this.name = name;
    }
   abstract void printName();
   abstract void print(int index);
}
