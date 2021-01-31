package ChainofResposibility.method;

import ChainofResposibility.entity.Message;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-14:00
 * @Description:
 * @Version: 1.0
 */
public class UrlFilter implements Filter{
    @Override
    public boolean doFilter(Message msg) {

        String m = msg.getMsg()
                .replace("localhost.com","http://10.41.15.44");
        msg.setMsg(m);
        return true;
    }
}
