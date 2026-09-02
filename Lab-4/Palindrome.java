//7. Write a program in Java to print all 3-digit prime numbers.[C] 

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int a=sc.nextInt();
        
        palindrome_no(a);
        sc.close();
    }

    public static void palindrome_no(int a)
    {
        int original = a;
        int remainder,reversed=0;
        
        while (a!=0) {
            remainder = a%10; 
            reversed = reversed * 10 + remainder;
            a=a/10; 
        }
    
    if (original == reversed)
    {
        System.out.println("Given No. is a palindrome number."+original);
    } 
    else 
    {
        System.out.println("Given No. is not a palindrome number."+original);
    }

    }
}
