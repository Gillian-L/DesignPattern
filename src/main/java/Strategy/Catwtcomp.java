package Strategy;

import java.util.Comparator;

/**
 * @Author: Gillian
 * @Date: 2020/11/2-9:11
 * @Description:
 * @Version: 1.0
 */
public class Catwtcomp implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getWt()>o2.getWt()){return 1;}
        else if(o1.getWt()<o2.getWt()){return -1;}
        else return 0;
    }
}
