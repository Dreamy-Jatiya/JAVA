//3 Write a java program to take user input [A] 
//i. Through Command Line Argument.

public class A3i
{
    public static void main(String[] args)
    {
        System.out.println("Enter integer:");
         int i= Integer.parseInt(args[0]);
         System.out.println("Enter float:");
         float f= Float.parseFloat(args[1]);
         System.out.println("Enter double number:");
         double d= Double.parseDouble(args[2]);
         System.out.println("Enter Character:");
         char a=args[3].charAt(0);
         System.out.println("Enter Short Int:");
         short j= Short.parseShort(args[4]);
         System.out.println("Enter String:");
          String str = args[5];
System.out.println("Int:"+i);
System.out.println("Float:"+f);
System.out.println("Double:"+d);
System.out.println("Character:"+a);
System.out.println("short:"+j);
System.out.println("string:"+str);

    }
}