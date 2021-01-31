package Visitor.entity;


/**
 * @Author: Gillian
 * @Date: 2020/11/17-14:01
 * @Description: Gillian_pro:Visitor.entity
 * @Version: 1.0
 */
public class Web_Msb implements WebResource{
    private Resource_Pub pub;
    private Resource_Priv priv;

    public Web_Msb() {
        this.pub = new Resource_Pub();
        this.priv = new Resource_Priv();
    }

    @Override
    public String getContext() {
        return null;
    }

    @Override
    public void accept(WebVisitor v) {
        pub.accept(v);
        priv.accept(v);
    }

    private class Resource_Pub implements WebResource{
        private final String context = "public";

        public String getContext() {
            return context;
        }

        @Override
        public void accept(WebVisitor v) {
            v.visit(this);
        }
    }

    private class Resource_Priv implements WebResource{
        private final String context = "private";

        public String getContext() {
            return context;
        }

        @Override
        public void accept(WebVisitor v) {
            v.visit(this);
        }
    }
}
