 // 2. Write a program to check whether a number is even or odd.[A] 
// Using Function


import java.util.Scanner;
public class Oddeven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter No. - ");
        int i=sc.nextInt();

        odd_even(i);

        sc.close();
    }

    public static void odd_even(int i)
    {   
        if(i%2==0)
        {
            System.out.println(i+" is Even");
        }
        else
        {
            System.out.println(i+" is Odd");
        }
    }

}
