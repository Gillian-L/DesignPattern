package Strategy;

import java.util.Comparator;
import java.util.Stack;

/**
 * @Author: Gillian
 * @Date: 2020/11/2-9:16
 * @Description:
 * @Version: 1.0
 */
public class Sorter<T> {

    public void sort(T[] t, Comparator<T> comt){
        for (int i = 0; i <t.length ; i++) {
            for (int j = i+1; j <t.length; j++) {
                if (comt.compare(t[i],t[j])<0){
                    T tmp = t[j];
                    t[j] = t[i];
                    t[i] = tmp;
                   // swap(t,i,j);
                }
                    System.out.print("i="+i+"j="+j);
                for (T tt:t){
                    System.out.print(tt);
                }
                System.out.println("");
            }
        }
        System.out.println("----");
    }

    public static<T> void bubbleSort(T[] t, Comparator<T> comt){
        int lastswappos = t.length-1;
        int swappos = 0;
        for (int i = 0; i <t.length ; i++) {
            boolean flag = true;
            for (int j = 0; j <lastswappos; j++) {
                if (comt.compare(t[j],t[j+1])<0){
                    T tmp = t[j+1];
                    t[j+1] = t[j];
                    t[j] = tmp;
                    flag = false;
                    swappos=j;
                    // swap(t,i,j);
                }
                System.out.print("i="+i+"j="+j);
                for (T tt:t){
                    System.out.print(tt);
                }
                System.out.println("");
            }
            lastswappos=swappos;
            if (flag==true) break;
        }
        System.out.println("----");
    }

  /*  private void swap(T[] t, int i,int j){
        T tmp = t[i];
        t[i] = t[j];
        t[j] = tmp;
    }*/
  public static<T> void quickSort(T[] t,Comparator<T> comt){
      quickSort2(t,0,t.length-1,comt);
  }
    public static<T> void quickSortwithStack(T[] t,Comparator<T> comt){
        quickSortwithStack(t,0,t.length-1,comt);
    }
    public static<T> void quickSort(T[] t, int startindex, int endindex, Comparator<T> comt){
        if(startindex>=endindex)return;
        int chooseradom = (int)(startindex+Math.random()*(endindex-startindex));
        T pivot = t[chooseradom];
        System.out.println("pivot="+pivot);
        t[chooseradom]=t[startindex];
        int pivotindex = startindex;
        int left = startindex;
        int right = endindex;
        while(right>=left){

            while (comt.compare(t[right],pivot)>=0){
                 right--;
                 if(right<=left)break;
            }
            if (right<=left)break;
            t[pivotindex]=t[right];
            pivotindex=right;
            left++;
            if(right<=left)break;
            while (comt.compare(t[left],pivot)<=0){
                left++;
                if(left>=right)break;
            }
            if(left>=right)break;
            t[pivotindex]=t[left];
            pivotindex=left;
            right--;
            if (right<=left)break;
        }
        t[pivotindex]=pivot;
        for (T tt:t){
            System.out.print(tt);
        }
        System.out.println("");
       quickSort(t,startindex,pivotindex-1,comt);
       quickSort(t,pivotindex+1,endindex,comt);
    }

    public static<T> void quickSort1(T[] t, int startindex, int endindex, Comparator<T> comt){
        if(startindex>=endindex)return;
        int chooseradom = (int)(startindex+Math.random()*(endindex-startindex));
        T pivot = t[chooseradom];
        System.out.println("pivot="+pivot);
        t[chooseradom]=t[startindex];
        int pivotindex = startindex;
        int left = startindex;
        int right = endindex;
        while ( right >= left ){
//right指针从右向左进行比较
            while ( right >= left ) {
                if (comt.compare(t[right],pivot)<0) {
                    t[left] = t[right];
                    pivotindex = right;
                    left++;
                    break;
                }
                right--;
            }
//left指针从左向右进行比较
            while ( right >= left ) {
                if (comt.compare(t[left],pivot)>0) {
                    t[right] = t[left];
                    pivotindex = left;
                    right--;
                    break;
                }
                left++;
            }
        }
        t[pivotindex] = pivot;
        for (T tt:t){
            System.out.print(tt);
        }
        System.out.println("");
        quickSort1(t,startindex,pivotindex-1,comt);
        quickSort1(t,pivotindex+1,endindex,comt);
    }

    public static<T> void quickSort2(T[] t, int startindex, int endindex, Comparator<T> comt){
        if(startindex>=endindex)return;
        int chooseradom = (int)(startindex+Math.random()*(endindex-startindex));
        T pivot = t[chooseradom];
        System.out.println("pivot="+pivot);
        t[chooseradom]=t[startindex];
      //  int pivotindex = startindex;
        int left = startindex;
        int right = endindex;
        while ( right > left ){
//right指针从右向左进行比较
            while ( right > left ) {
                if (comt.compare(t[right],pivot)<0) {
                    t[left] = t[right];
                 //   pivotindex = right;
                    left++;
                    break;
                }
                right--;
            }
//left指针从左向右进行比较
            while ( right > left ) {
                if (comt.compare(t[left],pivot)>0) {
                    t[right] = t[left];
                //    pivotindex = left;
                    right--;
                    break;
                }
                left++;
            }
        }
       // t[pivotindex] = pivot;
        t[right]=pivot;
        for (T tt:t){
            System.out.print(tt);
        }
        System.out.println("");
        /*quickSort2(t,startindex,pivotindex-1,comt);
        quickSort2(t,pivotindex+1,endindex,comt);*/
        quickSort2(t,startindex,right-1,comt);
        quickSort2(t,right+1,endindex,comt);
    }

    public static<T> void quickSortwithStack(T[] t, int startindex, int endindex, Comparator<T> comt){
        Stack<Integer> stack = new Stack<>();
        stack.push(startindex);
        stack.push(endindex);
        while (!stack.isEmpty()) {
            endindex=stack.pop();
            startindex=stack.pop();
            int chooseradom = (int) (startindex + Math.random() * (endindex - startindex));
            T pivot = t[chooseradom];
            System.out.println("pivot=" + pivot);
            t[chooseradom] = t[startindex];
            //  int pivotindex = startindex;
            int left = startindex;
            int right = endindex;
            while (right > left) {
//right指针从右向左进行比较
                while (right > left) {
                    if (comt.compare(t[right], pivot) < 0) {
                        t[left] = t[right];
                        //   pivotindex = right;
                        left++;
                        break;
                    }
                    right--;
                }
//left指针从左向右进行比较
                while (right > left) {
                    if (comt.compare(t[left], pivot) > 0) {
                        t[right] = t[left];
                        //    pivotindex = left;
                        right--;
                        break;
                    }
                    left++;
                }
            }
            // t[pivotindex] = pivot;
            t[right] = pivot;
            for (T tt : t) {
                System.out.print(tt);
            }
            System.out.println("");
            if(startindex<right-1){
                stack.push(startindex);
                stack.push(right-1);
            }
            if(right+1<endindex){
                stack.push(right+1);
                stack.push(endindex);
            }
        }
    }



    public static<T> void quickSort_PointerSwap(T[] t, int startindex, int endindex, Comparator<T> comt){
        if(startindex>=endindex)return;
        int chooseradom = (int)(startindex+Math.random()*(endindex-startindex));
        T pivot = t[chooseradom];
        System.out.println("pivot="+pivot);
        t[chooseradom]=t[startindex];
        int left = startindex;
        int right = endindex;
        while(right>left){

            while (right>left){
                if (comt.compare(t[right],pivot)<0){
                    left++;
                    break;
                }
                right--;
            }
            while (right>left){
                if(comt.compare(t[left],pivot)>0){
                    T temp = t[left];
                    t[left]=t[right];
                    t[right]=temp;
                    right--;
                    break;
                }
                left++;
            }
        }
        t[startindex]=t[right];
        t[right]=pivot;
        for (T tt:t){
            System.out.print(tt);
        }
        System.out.println("");
        quickSort_PointerSwap(t,startindex,right-1,comt);
        quickSort_PointerSwap(t,right+1,endindex,comt);
    }

}
