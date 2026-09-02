//2. Write a program to create basic calculator by getting 2 numbers and an operation
// (+,/,*,%) from the user and apply the operation given in a string on the given numbers.[A] 

import java.util.Scanner;
public class Basiccalculator
{
    public static void main(String[] args)
     {  Scanner sc=new Scanner(System.in);
        
         System.out.println("enetr no1:");
        int i=sc.nextInt();
        System.out.println("enter no2:");
        int j=sc.nextInt();
        System.out.println("Enter choice:");
         System.out.println("1.addition 2.subtraction 3.multiplication 4.division 5.modulo");
        int choice=sc.nextInt();
       
    switch(choice)
        {
            case 1 :
        {
            System.out.println("Addition:"+(i+j));
        }
            break;
        case 2:
        {
            System.out.println("subtraction:"+(i-j));
        } 
         break;
         case 3:
         {
            System.out.println("multiplication:"+(i*j));
         }
         break;
         case 4:
         {
            System.out.println("division:"+(i/j));
         }
        break;
        case 5:
            {
                System.out.println("moduelo:"+(i%j));
            }
            break;
        }
        sc.close();
    }
}