//2. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). 
//   Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the 
//   respective   methods to handle deposits and withdrawals for each account type.[A]

import java.util.Scanner;
abstract class BankAccount {
    double balance;
    BankAccount(double balance){
        this.balance=balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
class Saving_Account extends BankAccount{
    Saving_Account(double balance){
        super(balance);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Savings: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
        } else {
            System.out.println("Insufficient balance in Savings Account");
        }
    }
}
class Current_Account extends BankAccount{
    Current_Account(double balance){
        super(balance);
    }
     @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited in Current: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + 500) {
            balance -= amount;
            System.out.println("Withdrawn from Current: " + amount);
        } else {
            System.out.println("Limit exceeded in Current Account");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAccount ba;
        System.out.println("1)SavingAccount/2)CurrentAccount : ");
        int c=sc.nextInt();
        if(c==1){
            ba=new Saving_Account(2000);
        }
        else{
            ba=new Current_Account(1000);
        }
        ba.deposit(500);
        ba.withdraw(5000);
        sc.close();
    }
}
