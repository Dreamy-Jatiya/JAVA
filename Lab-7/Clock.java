//2. Write a Java program to find the angle between the hour and minute hands.[A] 
import java.util.Scanner;
class Angle{
    void Time(int hour,int min){
        double h=(30*hour)+(0.5*min);
        double m=6*min;
        double Fans=Math.abs(h-m);
        if(Fans<0){
            Fans=-Fans;
        }
        if(Fans>180){
            Fans=360-Fans;
        }
        System.out.println("Angle=  "+Fans);
    }
}

public class Clock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Hour(1 to 12) = ");
        int hour=sc.nextInt();
        System.out.print("Enter Minute(0 to 59) = ");
        int min=sc.nextInt();
        
        Angle a=new Angle();
        a.Time(hour,min);
        sc.close();
    }
}
