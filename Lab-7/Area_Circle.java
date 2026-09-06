//1. Write a program to create circle class with area function to find area of circle. [A] 
import java.util.Scanner;

class Circle{
    void area(int r){
        double area;
        area=(3.14*r*r);
        System.out.println("Area of Circle = "+area);
    }
}
public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter radius = ");
        int r=sc.nextInt();
        Circle c = new Circle();
        c.area(r);
        sc.close();
    }
}
