class Account{
    int accNum;
    String accType;
    double balance;

    void setter(int n,String t,double b){
        accNum=n;
        accType=t;
        balance=b;
    }

    void getter(){
        System.out.println(accNum);
        System.out.println(accType);
        System.out.println(balance);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Account a1=new Account();
        Account a2=new Account();
        Account a3=new Account();
        a1.setter(111, "saving", 200000);
        a2.setter(222,"bussiness",300000);
        a3.setter(333, "Saving", 100000);

        a1.getter();
        a2.getter();
        a3.getter();
    }
}
