package Iterator.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/16-14:38
 * @Description: Gillian_pro:Iterator.entity
 * @Version: 1.0
 */
public class LinkedList_<E> {
  //  private Linkednode elements;
    private int size;
    private Linkednode head;
    private Linkednode tail;

    public LinkedList_() {
        //this.elements=null;
        this.size=0;
        this.head=null;
        this.tail=null;
    }

    public  void add(E e){
         if(head==null&tail==null){
             this.head=tail=new Linkednode(e,null);
             //head=tail=elements;
             size++;
         }
         else{
             Linkednode elements_new = new Linkednode(e, null);
             tail.next= elements_new;
             tail=tail.next;
             size++;
         }
     }

     public int size(){
        return size;
     }

     public Object get(int num){
        if (num<size){
            Linkednode element = head;
            for (int i = 0; i <num ; i++) {
                element = element.next;
            }
            return element.value;
        }
        else{
            return null;
        }

     }

     public LinkedListIterator iterator(){
        return new LinkedListIterator();
     }

     class LinkedListIterator implements Iterator_<E>{
        private int index;

         public LinkedListIterator() {
             index=0;
         }

         @Override
         public boolean hasNext() {
             if (get(index)!=null){
                 return true;
             }
             else return false;
         }

         @Override
         public E next() {
             return (E)get(index++);
         }
     }



    class Linkednode{
        private Object value;
        private Linkednode next;

        public Linkednode(Object value, Linkednode next) {
            this.value = value;
            this.next = next;
        }
    }

}
