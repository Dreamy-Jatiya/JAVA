//6 Write a program that prompts the user to enter a letter and check whether a letter is a 
//vowel or a constant.[C] 
import java.util.Scanner;

public class A6  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character:");
        char a = sc.next().charAt(0);

        if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u' ||
             a=='A' || a=='E' || a=='I' || a=='O' || a=='U')
        {
            System.out.println("character is vowel");
        } 
        else 
        {
             System.out.println("character is consonant");
        }


        sc.close();
    }
}
