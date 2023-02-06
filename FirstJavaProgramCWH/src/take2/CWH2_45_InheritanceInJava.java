package take2;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class, and setting x now!");
        this.x = x;
    }
    // Constructor

    // Method
    public void printMe(){
        System.out.println("I am a printme method");

    }

}
// Dervied class

// Subclass extends superclass/base/parent class
class Derived extends Base{
    // All properties and methods that are available in Base class will be
    // available in the derived class.
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWH2_45_InheritanceInJava {
    public static void main(String[] args) {

        // Base class object
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Dervied class object
        Derived d = new Derived();
        d.setX(50);
        System.out.println(d.getX());

        d.setY(100);
        System.out.println(d.getY());
    }
}
