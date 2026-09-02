//5 Write a program that prompts the user to enter three numbers. Find the largest number.[C] 


import java.util.Scanner;
public class Largestnumber
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no1:");
        int i=sc.nextInt();
        System.out.println("enter no2:");
        int j=sc.nextInt();
        System.out.println("enter no3:");
        int k=sc.nextInt();
        if(i>j)
        { 
            if(i>k)
            {
                System.out.println("i is the Largest");
            }
        }
       else
         {
            if(j>k)
        { System.out.println("j is Largest");
        }
        else{
            System.out.println("k is largest");
        }
    }
    sc.close();
    }
}