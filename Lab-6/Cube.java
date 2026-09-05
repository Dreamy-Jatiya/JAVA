class volume{
    double height;
    double width;
    double depth;

    void setter(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }

    double volume1(){
        return height*width*depth;
    }
}
public class Cube {
    public static void main(String[] args) {
        volume v1=new volume();
        v1.setter(10,10,10);
        volume v2=new volume();
        v2.setter(20,20,20);
        
        double volume=v1.volume1();
        double ans=v2.volume1();
        System.out.println(""+volume);
        System.out.println(""+ans);
    }
}
