// 1. The marks obtained by a student in 5 different subjects are input through the keyboard.  
//     The student gets a division as per the following rules: 
//         I. Percentage above or equals to 60-first division 
//         II. Percentage between 50 to 59-second division 
//         III. Percentage between 40 and 49-Third division 
//         IV. Percentage less than 40-fail 
//     Write a program to calculate the division obtained by the student.[A]

// Using Function



import java.util.Scanner;
public class Marks
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter marks of sub1:");
        int a=sc.nextInt();
        System.out.println("enter marks of sub2:");
        int b=sc.nextInt();
        System.out.println("enter marks of sub3:");
        int c=sc.nextInt();
        System.out.println("enter marks of sub4:");
        int d=sc.nextInt();
        System.out.println("enter marks of sub5:");
        int e=sc.nextInt();
        
        result(a,b,c,d,e);
        sc.close();

     }
        public static void result(int a,int b,int c,int d,int e)
        {
           int sum=a+b+c+d+e;
        float per=((sum/500.00f)*100);
        System.out.println("Percentage:"+per);
 
        if(per>=60)
        {
            System.out.println("first division");
        }
        else if(per>=50)
        {
            System.out.println("second division");
        }
        else if(per>=40)
        {
            System.out.println("Third division");
        }
        else if(per<40)
        {
            System.out.println("fail");
        }

    }
}