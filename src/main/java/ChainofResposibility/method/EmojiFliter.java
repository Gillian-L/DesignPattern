package ChainofResposibility.method;

import ChainofResposibility.entity.Message;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-13:57
 * @Description:
 * @Version: 1.0
 */
public class EmojiFliter implements Filter{
    @Override
    public boolean doFilter(Message msg) {

        String m = msg.getMsg()
                .replace(":-)",":-(");
        msg.setMsg(m);
        return true;
    }
}
