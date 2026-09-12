//1. Write a program that illustrates interface inheritance. Interface A is extended by A1 and A2. Interface A12 inherits from both A1 and A2.
//   Each interface declares one constant and one method. Class B implements A12.Instantiate B and invoke each of its methods.
//   Each method displays one of the constants.[A]

interface A{
    int a=21;
    void disp();
}
interface A1 extends A{
    int a=22;
    void disp1();
}
interface A2 extends A{
    int a=23;
    void disp2();
}
interface A12 extends A1,A2{
    int a=24;
    void disp12();
}
class B implements A12{
    public void disp(){
        System.out.println("Int = "+a);
    }
    public void disp1(){
        System.out.println("Int1 = "+a);
    }
    public void disp2(){
        System.out.println("Int2 = "+a);
    }
    public void disp12(){
        System.out.println("Int12 = "+a);
    }
}
public class Program1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.disp();
        obj.disp1();
        obj.disp2();
        obj.disp12();
    }
}
