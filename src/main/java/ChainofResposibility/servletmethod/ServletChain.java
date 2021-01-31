package ChainofResposibility.servletmethod;

import ChainofResposibility.entity.ServletMsg;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-9:04
 * @Description:
 * @Version: 1.0
 */
public class ServletChain implements ServletFilter{
    List<ServletFilter> filters = new ArrayList<>();
     int i =0;
    public ServletChain add(ServletFilter filter){
        filters.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(ServletMsg msg,ServletFilter chain) {
           // int i = 0;
            if (i==filters.size())return true;
            i++;
            filters.get(i-1).doFilter(msg,chain);
        //    count++;
        return true;
    }
}
