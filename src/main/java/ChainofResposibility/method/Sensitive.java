package ChainofResposibility.method;

import ChainofResposibility.entity.Message;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-10:31
 * @Description:
 * @Version: 1.0
 */
public class Sensitive implements Filter{
    @Override
    public boolean doFilter(Message msg) {
        String m = msg.getMsg()
                .replace("某某某","河蟹").replace("Gil","Char");
        msg.setMsg(m);
        return true;
    }
}
