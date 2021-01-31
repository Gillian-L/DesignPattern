package ChainofResposibility.servletmethod;

import ChainofResposibility.entity.ServletMsg;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-9:16
 * @Description:
 * @Version: 1.0
 */
public class ServletSensitiveFilter implements ServletFilter{

    @Override
    public boolean doFilter(ServletMsg msg, ServletFilter chain) {
        String m = msg.getRequest()
                .replace("某某某","河蟹").replace("Gil","Char");
        msg.setRequest(m);
        chain.doFilter(msg,chain);
        String response = msg.getResponse() + this.getClass().getName()+"2222----\n";
        msg.setResponse(response);
        return true;
    }
}
