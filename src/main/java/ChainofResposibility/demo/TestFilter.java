package ChainofResposibility.demo;

import ChainofResposibility.entity.Message;
import ChainofResposibility.method.*;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-10:41
 * @Description:
 * @Version: 1.0
 */
public class TestFilter {

    public static void main(String[] args) {
        String msg = "我是某某某，某某的Gil 某某某Gil <dfd>,<>;;;:-) localhost.com";
       // String msg = "我是某某某，某某的Gil 某某某Gil <dfd>,<>;;;:- localhost.com";
        Message message = new Message(msg);
        System.out.println(message.getMsg());
        FliterList fl = new FliterList();
        FliterList fc = new FliterList();
        fc.add(new EmojiFliter()).add(new UrlFilter());
        fl.add(new ScriptFilter()).add(new Sensitive()).add(fc);
        fl.doFilter(message);
        System.out.println(message.getMsg());
    }
}
