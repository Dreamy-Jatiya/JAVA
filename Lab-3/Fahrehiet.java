//4. Write a program to convert temperature from Fahrenheit to Celsius. 
// (Formula : c = f-32*5/9 ) [B] 

import java.util.Scanner;
public class Fahrehiet
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter fahrenhiet:");
int f=sc.nextInt();
System.out.println("Celsius:"+((f-32)*5/9));
}
}