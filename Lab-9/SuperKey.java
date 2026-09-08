//3. Demonstrate the use of Super Keyword. [A] 
class Base{
    int a=101;
    public Base()
    {
        System.out.println("It is Parent calss");
    }
    void display(){
        System.out.println("It belongs to parent class");
    }
}
class pillar extends Base{
    public pillar(){
        super();
        System.out.println("It calls child class");
    }
    @Override
    void display(){
        super.display();
        System.out.println("I belongs to child class");
    }
}

public class SuperKey {

    public static void main(String[] args) {
        pillar p=new pillar();
        p.display();
    }
}