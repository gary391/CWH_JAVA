package take2;

/*
This and super
This is a reference of the object that is being created.
 */
class EkClass {
    int a;

    public int getA() {
        return a;
    }

    // Constructor
    EkClass(int a){
        this.a = a;
    }
    // Method
    public int returnOne() {
        return 1;
    }

}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor in DoClass");
    }

}
public class CWH2_47_ThisSuper {
    public static void main(String[] args) {
    EkClass ek = new EkClass(70);
    DoClass dk = new DoClass(100);
        System.out.println(ek.getA());

    }
}
