package ChainofResposibility.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/6-13:48
 * @Description:
 * @Version: 1.0
 */
public class Message {
    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
