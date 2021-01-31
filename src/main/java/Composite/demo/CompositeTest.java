package Composite.demo;

import Composite.entity.Branch;
import Composite.entity.LeafNode;

/**
 * @Author: Gillian
 * @Date: 2020/11/24-9:40
 * @Description: Gillian_pro:Composite.demo
 * @Version: 1.0
 */
public class CompositeTest {

    public static void main(String[] args) {
        Branch root = new Branch("root");
        Branch chapter1 = new Branch("chapter1");
        Branch chapter2 = new Branch("chapter2");
        Branch branch1 = new Branch("branch1.3");
        LeafNode rootleaf = new LeafNode("rootleaf");
        LeafNode leaf1 = new LeafNode("leaf1.1");
        LeafNode leaf2 = new LeafNode("leaf1.2");
        LeafNode leaf3 = new LeafNode("leaf2.1");
        LeafNode leaf4 = new LeafNode("leaf1.3.1");
        LeafNode leaf5 = new LeafNode("leaf1.3.2");

        root.add(chapter1).add(chapter2).add(rootleaf);
        chapter1.add(leaf1).add(leaf2).add(branch1.add(leaf4).add(leaf5));
        chapter2.add(leaf3);

        root.print(0);
    }
}
