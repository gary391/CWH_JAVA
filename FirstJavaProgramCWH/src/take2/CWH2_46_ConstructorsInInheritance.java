package take2;

class MyBase {


    public int x;

    // Constructor

    MyBase(){
        System.out.println("I am a Mybase class constructor");
    }

    MyBase(int x){
        System.out.println("I am a overloaded Mybase class constructor with a value of a as: "+ x);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class MyDerived extends MyBase{

    // This is the derived cl ass constructor, this will be called after the base class constructor.
    MyDerived(){
//        super(0);
        System.out.println("I am a Derived class constructor!!");
    }

    MyDerived(int x, int y){
        super(x);
        System.out.println("I am a overloaded Derived class constructor with a value of y as:" + y);
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildofMyDervied extends MyDerived{
        ChildofMyDervied (){
            System.out.println("I am a child of dervied constructor");
        }
        ChildofMyDervied(int x, int y, int z){
            super(x, y);
            System.out.println("I am a overloaded Child of Derived class constructor with a value of z as:" + z);
        }
}

public class CWH2_46_ConstructorsInInheritance {
    public static void main(String[] args) {

//        MyBase b = new MyBase();
//        MyDerived d1 = new MyDerived();
//        MyDerived d = new MyDerived(10, 20);
//        ChildofMyDervied cd = new ChildofMyDervied();
        ChildofMyDervied childofMyDervied = new ChildofMyDervied(10, 20, 30 );
    }
}
