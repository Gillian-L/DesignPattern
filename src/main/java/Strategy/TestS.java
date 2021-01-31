package Strategy;

/**
 * @Author: Gillian
 * @Date: 2020/11/2-9:43
 * @Description:
 * @Version: 1.0
 */
public class TestS {
    public static void main(String[] args) {
       Cat[] c ={new Cat(8,8,8),new Cat(6,6,6),new Cat(9,9,9),
               new Cat(3,3,3),new Cat(11,11,11),new Cat(9,9,9),new Cat(5,5,5),new Cat(2,2,2)};
       // Pet[] c = {new Cat(2,5,6),new Cat(4,1,55),new Dog(3),new Dog(23)};
       /* Cat[] c ={new Cat(6,6,6),new Cat(9,9,9),
                new Cat(8,8,8),new Cat(11,11,11)};*/
       // Cat[] c ={new Cat(6,6,6)};
      /*  for (Pet cc:c) {
            System.out.println(cc);
        }*/
       // Sorter s = new Sorter<Pet>();
       // Sorter.bubbleSort(c,new Catwtcomp());
        Sorter.quickSortwithStack(c,new Catwtcomp());
        //Sorter.quickSort(c,new Catwtcomp());
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
    }
}
