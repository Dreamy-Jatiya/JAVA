//5. Write a program to check whether a year is leap year or not.[B] 


import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Year = ");
        int a=sc.nextInt();

        leapornot(a);

        sc.close();
    }
    public static void leapornot(int a) {
        if(a%400==0||(a%100!=0&&a%4==0)){
                System.out.println("Year is a Leap Year");
        }
        else
        {
            System.out.println("Year is not a Leap Year");
        }
           
        }
}
