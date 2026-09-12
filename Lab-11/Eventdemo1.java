//2. Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener along with
//  mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods. Also create KeyListener interface which inherits
//  EventListener along with keyPressed(), keyReleased() methods. WAP to create EventDemo class which implements MouseListener and KeyListener
//  and demonstrate all the methods of the interfaces. [A]

interface EventListener{
    void performEvent();
}
interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}
class EventDemo implements MouseListener, KeyListener {

    public void performEvent() {
        System.out.println("Event performed");
    }

    public void mouseClicked() {
        System.out.println("Mouse clicked");
    }

    public void mousePressed() {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased() {
        System.out.println("Mouse released");
    }

    public void mouseMoved() {
        System.out.println("Mouse moved");
    }

    public void mouseDragged() {
        System.out.println("Mouse dragged");
    }

    public void keyPressed() {
        System.out.println("Key pressed");
    }

    public void keyReleased() {
        System.out.println("Key released");
    }
}
public class Eventdemo1 {
    public static void main(String[] args) {
        EventDemo obj = new EventDemo();

        obj.performEvent();

        obj.mouseClicked();
        obj.mousePressed();
        obj.mouseReleased();
        obj.mouseMoved();
        obj.mouseDragged();

        obj.keyPressed();
        obj.keyReleased();
    }
}
