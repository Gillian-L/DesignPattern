package ChainofResposibility.method;

import ChainofResposibility.entity.Message;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-10:17
 * @Description:
 * @Version: 1.0
 */
public interface Filter {
    public boolean doFilter(Message msg);
}
