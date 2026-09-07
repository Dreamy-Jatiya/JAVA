//4. Write a Java program to create a class called Area with a static final variable PI=3.14159. 
//   Implement a method to calculate the area of a circle given its radius.[B]
class Area {
    static final double PI = 3.14159;
    static double calculateArea(double radius) {
        return PI * radius * radius;
    }
}
public class Areaofcircle {
    public static void main(String[] args) {
        double radius = 5;
        double area = Area.calculateArea(radius);
        
        System.out.println("Radius: " + radius);
        System.out.println("Area of Circle: " + area);
    }
}
