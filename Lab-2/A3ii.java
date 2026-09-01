//3 Write a java program to take user input [A].
//ii. Through Scanner class. 

import java.util.Scanner;

public class A3ii
{
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        System.out.println("int");
       int i = sc.nextInt();
        System.out.println("float");
        float f= sc.nextFloat();
        System.out.println("double");
        double d=sc.nextDouble();
        System.out.println("short");
        Short j=sc.nextShort();
        System.out.println("character");
        char c=sc.next().charAt(0);
        System.out.println("string");
        String str=sc.next();
        System.out.println("boolean");
        Boolean b=sc.nextBoolean();

        sc.nextLine();
       System.out.println(" sentence");
        String s=sc.nextLine();
         
        System.out.println("int :"+i);
        System.out.println("float :"+f);
        System.out.println("double:"+d);
        System.out.println("short:"+j);
        System.out.println("character:"+c);
        System.out.println("String:"+str);
        System.out.println("boolean:"+b);
        System.out.println("senetence:"+s);
        sc.close();






    }
}