//5 Write a program that reads a number in meters, converts it to feet, and displays the 
//result.[B] 
// *****conversion from meter to feet*****

import java.util.Scanner;

public class A5
{
public static void main(String[]args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("ENTER Number in meter:");
    float mater=sc.nextFloat();
    float Feet= 3.2808f*mater;

    System.out.println("conversion:"+Feet);
    sc.close();
}
}