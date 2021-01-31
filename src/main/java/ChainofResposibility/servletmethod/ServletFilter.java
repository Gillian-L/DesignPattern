package ChainofResposibility.servletmethod;

import ChainofResposibility.entity.ServletMsg;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-8:59
 * @Description:
 * @Version: 1.0
 */
public interface ServletFilter {
    public boolean doFilter(ServletMsg msg,ServletFilter chain);
}
