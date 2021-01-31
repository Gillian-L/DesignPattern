package ChainofResposibility.method;

import ChainofResposibility.entity.Message;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-10:20
 * @Description:
 * @Version: 1.0
 */
public class ScriptFilter implements Filter{
    @Override
    public boolean doFilter(Message msg) {

         String m = msg.getMsg()
                 .replace('<','[').replace('>',']');
        msg.setMsg(m);
        return true;
    }
}
