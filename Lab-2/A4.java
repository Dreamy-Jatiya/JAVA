//4 Write a program to get 2 numbers from the user and print the sum of two numbers 
//using command line and Scanner class.[A] 

import java.util.Scanner;
public class A4
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
     System.out.println("enter no 1");
     int i=sc.nextInt();
     System.out.println("enter no 2");
    int j=sc.nextInt();

    System.out.println("x:"+(i+j));
    sc.close();

    }
}


//----------------OR-------------------

/*Addition of two number using command line
public class A4ii
{
    public static void main(String[] args)
    {
        System.out.println("");
        int i =Integer.parseInt(args[0]);
        System.out.println("");
        int j= Integer.parseInt(args[1]);
        System.out.println("x:"+(i+j));

    }
}
*/