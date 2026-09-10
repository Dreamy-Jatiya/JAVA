//1. The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. 
//   Write a java program that demonstrates how to establish this class hierarchy. Declare 
//   one instance variable of type String that indicates the color of a vegetable. Create and 
//   display instances of these objects. Override the toString() method of object to return a 
//   string with the name of vegetable and its color. [A] 

abstract class Vegetable {
    String color;
    abstract public String toString();
    Vegetable(String color){
        this.color=color;
    }
    
}
class potato extends Vegetable{
    potato(String color){
        super(color);
    }
    public String toString(){
        return "Vegetable name : potato"+"color: "+color;
    }
}

class tomato extends Vegetable{
    tomato(String color){
        super(color);
    }    
        public String toString(){
        return "Vegetable name : tomato"+"color: "+color;
    }
}

class brinjal extends Vegetable{
    brinjal(String color){
        super(color);
    }
        public String toString(){
        return "Vegetable name : tomato"+"color: "+color;
    }
}

public class Vegetablecolor {
    public static void main(String[] args) {
        Vegetable v1=new potato("brown");
        Vegetable v2=new tomato("red");
        Vegetable v3=new brinjal("purple");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}