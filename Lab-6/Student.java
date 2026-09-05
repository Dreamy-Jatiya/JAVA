
class display{
    String name;
    int roll_no;
    double spi;
    String course;

    void setter(String n,int r,double s,String c){
        name=n;
        roll_no=r;
        spi=s;
        course=c;
    }
    void getter(){
        System.out.println(name);
        System.out.println(roll_no);
        System.out.println(spi);
        System.out.println(course);
    }
}

public class Student {
    public static void main(String[] args) {
        display d1=new display();
        display d2=new display();
        display d3=new display();
        d1.setter("lency",1,7.00,"cse");
        d2.setter("vaidehi",2,7.50,"cse");
        d3.setter("dhruvi",3,8.00,"cse");

        d1.getter();
        d2.getter();
        d3.getter();

    }
}
