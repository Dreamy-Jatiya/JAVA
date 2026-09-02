//3. Write a program to find maximum no from given 3 no.(without if-else).[A] 
// Using Function

import java.util.Scanner;
public class Maximum {
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;

       System.out.print("Enter No.1 -");
       int a=sc.nextInt();
       System.out.print("Enter No.2 -");
       int b=sc.nextInt();
       System.out.print("Enter No.3 -");
       int c=sc.nextInt();
       
        max_no(a,b,c);

        sc.close();
    }

    public static void max_no(int a,int b,int c) {
       int max;
       max=(a>b&&a>c)?a:(b>c?b:c);
        System.out.println("Largest No. is = "+max);
    }

}
