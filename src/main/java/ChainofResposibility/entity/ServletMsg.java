package ChainofResposibility.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-8:50
 * @Description:
 * @Version: 1.0
 */
public class ServletMsg {
    private String request;
    private String response;

    public ServletMsg(String request, String response) {
        this.request = request;
        this.response = response;
    }

    public String getRequest() {
        return request;
    }

    public String getResponse() {
        return response;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ServletMsg{" +
                "request='" + request + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
