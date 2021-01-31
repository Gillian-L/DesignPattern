package Observer.entity;

import Observer.event.ShowEvent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Gillian
 * @Date: 2020/11/10-14:29
 * @Description: Gillian_pro:Observer.entity
 * @Version: 1.0
 */
public class Nancy {
    private String name = "Nancy";
    private List<FansObserver> observers = new ArrayList<>();


    public Nancy add(FansObserver observer){
        observers.add(observer);
        return this;
    }

    public boolean makeShow(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse("2020-12-31:20:00:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ShowEvent event = new ShowEvent(date,"Hong Kong Coliseum",this);
        /*for (FansObserver observer:observers){
            observer.buytickets(event);
        }*/
        for (int i = 0; i <observers.size() ; i++) {
            if (!observers.get(i).buytickets(event)){return false;}

        }
        return true;
    }

    public String getName() {
        return name;
    }
}


