package Visitor.entity;

/**
 * @Author: Gillian
 * @Date: 2020/11/17-14:57
 * @Description: Gillian_pro:Visitor.entity
 * @Version: 1.0
 */
public class Visitor implements WebVisitor{
    @Override
    public void visit(WebResource r) {
        if (r.getContext()!="private"){
            System.out.println("access"+r.getContext() + r.getClass().getName());
        }
        else System.out.println("have no access");
    }

    public class Vip implements  WebVisitor{
        @Override
        public void visit(WebResource r) {
                System.out.println("VIP_access"+r.getContext() + r.getClass().getName());
        }
    }
}
