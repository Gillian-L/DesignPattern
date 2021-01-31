package Composite.entity;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Gillian
 * @Date: 2020/11/24-9:12
 * @Description: Gillian_pro:Composite.entity
 * @Version: 1.0
 */
public class Branch extends Node{
    private List<Node> nodes = new LinkedList<>();
    public Branch(String name) {
        super(name);
    }

    public Branch add(Node node){
        nodes.add(node);
        return this;
    }

   /* public List<Node> get(){
        return nodes;
    }*/
    @Override
    void printName() {

        System.out.println("Branch: " + super.getName());
    }

    @Override
    public void print(int index) {
        System.out.print(index+" ");
        for (int i = 0; i <index ; i++) {
            System.out.print("-");
        }
        printName();
        if (!nodes.isEmpty()){
            index++;
         for (Node n:nodes){
             n.print(index);
         }
        }
    }

  /*  public void printwithIndex(int index){
        for (int i = 0; i <index ; i++) {
            System.out.print("-");
        }
        printName();
        if (!nodes.isEmpty()){
            for (Node n:nodes){
               // n.(++index);
            }
        }
    }*/
}
