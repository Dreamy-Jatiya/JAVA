class Emp{
    String name;
    String jobTitle;
    double salary;
    double bonus;

    
    void setter(String n,String j,double s,double b){
     name=n;
     jobTitle=j;
     salary=s;
     bonus=b;
    }
    void getter(){
        System.out.println(name);
        System.out.println(jobTitle);
        System.out.println(salary);
        System.out.println(bonus);
        

    }
    void add(){
        System.out.println(salary+bonus);
    }
    void update(double newsalary){
        salary=newsalary;     
        System.out.println(newsalary);
     
    }
}
class Job{
    public static void main(String args[]){
     Emp e1=new Emp();
     Emp e2=new Emp();
     Emp e3=new Emp();
     e1.setter("dhruvi","en",100000,30000);
     e2.setter("krishna","selceman",20000,30000);     
     e3.setter("radha","bussinewoman",400000,30000);
     e1.getter();
     e2.getter();
     e3.getter();     
    e1.add();
    e2.add();
    e3.add();
    e1.update(200000);
    e2.update(300000);
    e3.update(400000);


    }
}