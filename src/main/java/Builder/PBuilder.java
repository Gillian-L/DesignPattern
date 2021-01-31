package Builder;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-15:52
 * @Description: Gillian_pro:Builder
 * @Version: 1.0
 */
public abstract class PBuilder {
    public abstract PBuilder createBasic(String idcardno,String name,int sex,int age);
    public abstract PBuilder createBody(double height,double weight);
    public abstract PBuilder createDegree(Persion.Degree degree);

    public abstract PBuilder createLocation(Persion.Location location);

    public abstract Persion builder();
}
