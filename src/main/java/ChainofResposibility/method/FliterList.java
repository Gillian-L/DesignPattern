package ChainofResposibility.method;

import ChainofResposibility.entity.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-10:34
 * @Description:
 * @Version: 1.0
 */
public class FliterList implements Filter{
    List<Filter> filters = new ArrayList<Filter>();

    public FliterList add(Filter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Message msg) {
        for(Filter f : filters){
            if (!f.doFilter(msg)){return false;}
        }
        return true;
    }
}
