package ChainofResposibility.servletmethod;

import ChainofResposibility.entity.ServletMsg;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-13:53
 * @Description: Gillian_pro:ChainofResposibility.servletmethod
 * @Version: 1.0
 */
public class EmojiServletFilter implements ServletFilter{
    @Override
    public boolean doFilter(ServletMsg msg, ServletFilter chain) {

        String m = msg.getRequest()
                .replace(":-)",":-(");
        msg.setRequest(m);
        chain.doFilter(msg,chain);
        String response = msg.getResponse() + this.getClass().getName()+"3333----\n";
        msg.setResponse(response);
        return true;
    }

}
