package Strategy;

import java.util.Comparator;

/**
 * @Author: Gillian
 * @Date: 2020/11/2-17:01
 * @Description:
 * @Version: 1.0
 */
public class Petftcomp implements Comparator<Pet> {

    @Override
    public int compare(Pet o1, Pet o2) {
        if(o1.getFt()>o2.getFt()){return 1;}
        else if(o1.getFt()<o2.getFt()){return -1;}
        else return 0;
    }
}
