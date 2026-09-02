//3. Write a program to calculate the area of Rectangle.[A]

import java.util.Scanner;
public class Area
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght:");
        int l=sc.nextInt();
        System.out.println("Enter Breadth:");
        int b=sc.nextInt();
        System.out.println("Area:"+(l*b));
    }
}