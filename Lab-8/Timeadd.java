//1. Write a program to add two different Time class’s objects. Time class contains 3 fields hours, Minute and Seconds.(Take input from user and 
//   assume user will always enter a valid data, e.g. if Time1 is 02:55:55 and Time2 is 03:07:10 then result is 06:03:05) [A] 

import java.util.Scanner;
class time
{
    int hours;
    int minutes;
    int seconds;

time(int hours,int minutes,int seconds)
{
    this.hours=hours;
    this.minutes=minutes;
    this.seconds=seconds;
}
time()
{
    this.hours=0;
    this.minutes=0;
    this.seconds=0;
}

   static  void add(time t1,time t2,time t3,time t4)
   {
       t4.hours=t1.hours+t2.hours+t3.hours;
       t4.minutes=t1.minutes+t2.minutes+t3.minutes;
       t4.seconds=t1.seconds+t2.seconds+t3.seconds;

       if(t4.seconds>=60)
       {
           t4.minutes+=t4.seconds/60;
           t4.seconds=t4.seconds%60;
       }
       if(t4.minutes>=60)
       {
           t4.hours+=t4.minutes/60;
           t4.minutes=t4.minutes%60;
       }
   }
}
public class Timeadd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time for 1 in hours, minutes and seconds:");
        time t1=new time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter the time for 2 in hours, minutes and seconds:");
        time t2=new time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter the time for 3 in hours, minutes and seconds:");
        time t3=new time(sc.nextInt(), sc.nextInt(), sc.nextInt());
        time t4=new time();
        time.add(t1, t2, t3, t4);
        System.out.println("Total time: " + t4.hours + " hours, " + t4.minutes + " minutes, " + t4.seconds + " seconds");

        sc.close();
    }
}