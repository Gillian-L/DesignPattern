package Builder;

/**
 * @Author: Gillian
 * @Date: 2020/11/9-15:37
 * @Description: Gillian_pro:Builder
 * @Version: 1.0
 */
public class Persion {
    private String idcardno;
    private String name;
    private int sex;
    private int age;
    private double height;
    private double weight;
    private Degree degree;
    private Location location;

    private Persion(){};

    @Override
    public String toString() {
        return "Persion{" +
                "idcardno='" + idcardno + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", degree=" + degree +
                ", location=" + location +
                '}';
    }

    public static class PersionBuilder extends PBuilder{
       /* @Override
        public int hashCode() {
            return super.hashCode();
        }
       */
        Persion persion = new Persion();
        @Override
        public PBuilder createBasic(String idcardno,String name,int sex,int age) {
            persion.idcardno=idcardno;
            persion.name=name;
            persion.sex=sex;
            persion.age=age;
            return this;
        }

        @Override
        public PBuilder createBody(double height,double weight) {
            persion.height=height;
            persion.weight=weight;
            return this;
        }

        @Override
        public PBuilder createDegree(Degree degree) {
            return null;
        }

        @Override
        public PBuilder createLocation(Location location) {
            persion.location=location;
            return this;
        }

        @Override
        public Persion builder() {
            return this.persion;
        }
    }

     static class Location {
        private String street;
        private String roomNo;

         public Location(String street, String roomNo) {
             this.street = street;
             this.roomNo = roomNo;
         }

         @Override
         public String toString() {
             return "Location{" +
                     "street='" + street + '\'' +
                     ", roomNo='" + roomNo + '\'' +
                     '}';
         }
     }

     class Degree {
        private String degreeName;
        private double score;


         @Override
         public String toString() {
             return "Degree{" +
                     "degreeName='" + degreeName + '\'' +
                     ", score=" + score +
                     '}';
         }
     }
}
