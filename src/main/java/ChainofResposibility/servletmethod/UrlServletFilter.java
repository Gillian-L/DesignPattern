package ChainofResposibility.servletmethod;

import ChainofResposibility.entity.ServletMsg;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-13:55
 * @Description: Gillian_pro:ChainofResposibility.servletmethod
 * @Version: 1.0
 */
public class UrlServletFilter implements ServletFilter{
    @Override
    public boolean doFilter(ServletMsg msg, ServletFilter chain) {

        String m = msg.getRequest()
                .replace("localhost.com","http://10.41.15.44");
        msg.setRequest(m);
        chain.doFilter(msg,chain);
        String response = msg.getResponse() + this.getClass().getName()+"4444----\n";
        msg.setResponse(response);
        return true;
    }
}
