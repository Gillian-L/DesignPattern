package Iterator.testiterator;

import Iterator.entity.ArrayList_;
import Iterator.entity.Iterator_;
import Iterator.entity.LinkedList_;

/**
 * @Author: Gillian
 * @Date: 2020/11/16-14:27
 * @Description: Gillian_pro:Iterator.testiterator
 * @Version: 1.0
 */
public class TestList {

    public static void main(String[] args) {
        ArrayList_<String> list = new ArrayList_();
        for (int i = 0; i <15 ; i++) {
            list.add("ss"+i);
        }
        System.out.println(list.size());
        System.out.println(list.get(16));

        LinkedList_<String> linkedList = new LinkedList_<>();
        for (int i = 0; i <5 ; i++) {
            linkedList.add("lll"+i);
        }
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(7));
        /*for (Object o:linkedList){

        }*/
        Iterator_ iterator = linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
