//4. Write a program to check that the given number is prime or not.[A] 
// Using Function

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a No.-");
        int a=sc.nextInt();

        primeornot(a);

        sc.close();
    }

    public static void primeornot(int a) {
        int count=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                count=count+1;
            }
        }
        if(count==0)
        {
            System.out.println("Prime No.");
        }
        else{
            System.out.println("Not a Prime No.");
        }
    }
}
