package Iterator.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/16-13:56
 * @Description: Gillian_pro:Iterator.entity
 * @Version: 1.0
 */
public class ArrayList_<E> {
    private Object[] elements;
    private int size;

    public ArrayList_() {
        this.elements = new Object[8];
    }

    public int size(){
        return this.size;
    }

    public boolean add(E e){
        if (size>=elements.length){
          Object[] elements_new = new Object[size*2];
          System.arraycopy(elements,0,elements_new,0,elements.length);
          this.elements=elements_new;
          elements_new[size]=e;
          size++;
          return true;
        }
        elements[size]=e;
        size++;
        return true;
    }

    public Object get(int num){
        if (num<size) {
            return elements[num];
        }
        else return null;
    }
}
