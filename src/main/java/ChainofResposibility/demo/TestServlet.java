package ChainofResposibility.demo;

import ChainofResposibility.entity.ServletMsg;
import ChainofResposibility.servletmethod.*;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-13:38
 * @Description: Gillian_pro:ChainofResposibility.demo
 * @Version: 1.0
 */
public class TestServlet {
    public static void main(String[] args) {
        String request = "我是某某某，某某的Gil 某某某Gil <dfd>,<>;;;:-) localhost.com";
        String response = "";
        ServletMsg servletmsg = new ServletMsg(request,response);
        System.out.println(servletmsg);
        ServletChain servletchain = new ServletChain();
        ServletChain chain = new ServletChain();
        chain.add(new EmojiServletFilter()).add(new UrlServletFilter());
        servletchain.add(new ScriptServletFilter()).add(new ServletSensitiveFilter()).add(chain);
      //  servletchain.add(new ScriptServletFilter()).add(new ServletSensitiveFilter()).add(new UrlServletFilter());
        servletchain.doFilter(servletmsg,servletchain);
        System.out.println(servletmsg);
    }
}
