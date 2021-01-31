package ChainofResposibility.servletmethod;

import ChainofResposibility.entity.ServletMsg;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-8:58
 * @Description:
 * @Version: 1.0
 */
public class ScriptServletFilter implements ServletFilter{
    @Override
    public boolean doFilter(ServletMsg msg,ServletFilter chain) {

        String m = msg.getRequest()
                .replace('<','[').replace('>',']');
        msg.setRequest(m);
        chain.doFilter(msg,chain);
        String response = msg.getResponse() + this.getClass().getName()+"1111----";
        msg.setResponse(response);
        return true;
    }
}
