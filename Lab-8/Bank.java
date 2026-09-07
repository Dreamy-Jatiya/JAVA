//3. Write a Java program to create a class called BankAccount with instance variables 'accountNo' and balance, and static variables bankName
//   and interestRate. Implement static methods to get and set the static variables. Create three BankAccount objects and print their details
//   along with the static variables. [A] 
class BankAccount{
    int accountNo;
    double balance;
    static String bankName;
    static double interestRate;

    BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
    static void setBankName(String name) {
        bankName = name;
    }
    static void setInterestRate(double rate) {
        interestRate = rate;
    }
    static String getBankName() {
        return bankName;
    }
    static double getInterestRate() {
        return interestRate;
    }
    void display() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("----------------------------");
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount.setBankName("State Bank of India");
        BankAccount.setInterestRate(5.5);

        BankAccount acc1 = new BankAccount(101, 5000);
        BankAccount acc2 = new BankAccount(102, 10000);
        BankAccount acc3 = new BankAccount(103, 15000);

        acc1.display();
        acc2.display();
        acc3.display();
    }
}
