//2. WAP that counts the number of objects created using static. [A] 
class ObjectCounter {
    static int count = 0;

    ObjectCounter() {
        count++;         
    }

    void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}
public class Countobjects {
      public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        obj3.displayCount();
    }
}
