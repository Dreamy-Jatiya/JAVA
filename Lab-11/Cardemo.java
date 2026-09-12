//4. Write a program in Java to create an interface Car with moveForward, moveBackward, moveLeft, moveRight, applyBreak methods, 
//   create a class named Swift and Thar which implement the Car interface. [B]

interface Car{
    void moveForward();
    void moveBackward();
    void moveLeft();
    void moveRight();
    void applyBreak();
}
class Swift implements Car{
    public void moveForward(){
        System.out.println("Move Forward");
    }
    public void moveBackward(){
        System.out.println("Move Backward");
    }
    public void moveLeft(){
        System.out.println("Move Left");
    }
    public void moveRight(){
        System.out.println("Move Right");
    }
    public void applyBreak(){
        System.out.println("Apply Break");
    }
}
class Thar implements Car{
    public void moveForward(){
        System.out.println("Move Forward");
    }
    public void moveBackward(){
        System.out.println("Move Backward");
    }
    public void moveLeft(){
        System.out.println("Move Left");
    }
    public void moveRight(){
        System.out.println("Move Right");
    }
    public void applyBreak(){
        System.out.println("Apply Break");
    }
}
public class Cardemo {
    public static void main(String[] args) {
        Car c1=new Swift();
        Car c2=new Thar();
        System.out.println("SWIFT");
        c1.moveForward();
        c1.moveBackward();
        c1.moveLeft();
        c1.moveRight();
        c1.applyBreak();
        System.out.println("-------------------------------");
        System.out.println("THAR");
        c2.moveForward();
        c2.moveBackward();
        c2.moveLeft();
        c2.moveRight();
        c2.applyBreak();
    }
}
