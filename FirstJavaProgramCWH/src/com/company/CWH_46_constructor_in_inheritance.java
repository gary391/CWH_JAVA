package com.company;

// Constructor in inheritance

// Super Class
class Base1{


    // constructor method of the base class, which executes as soon as an object is created (base or derived class).

    Base1(){
        System.out.println("I am a constructor of base class!");
    }

    // Constructor overloading
    Base1(int x){
        System.out.println("I am a overloaded constructor with value of x: "+ x);
    }

    public int x;

    // Setter Method
     public void setX(int x){
         this.x=x;
     }

    // Getter Method
    public int getX(){
         return x;
    }
}

// Sub Class
class Derived1 extends Base1{

    // Derived1 class constructor
    Derived1(){
//        super(88); // Will allow object of dervied class to call the overloaded constructor of the base class.
        System.out.println("I am a constructor of derived class!");
    }

// Derived1 class overloaded constructor
    Derived1(int x, int y){
        super(x); // this will call the overloaded constructor of the base class
        System.out.println("I am a overloaded constructor of derived1 class with value of y: "+ y);
    }
    public int y;

    // setter method
    public void setY(int y){
        this.y=y;
    }

    // getter method
    public int getY(){
        return y;
    }
}

// Child class of the derived1 class
class Childofderived extends Derived1{

    // constructor method
    Childofderived(){
        System.out.println("I am a constructor of child of derived1 class! ");
    }

    // overloaded constructor method
    Childofderived(int x, int y, int z){
        super(x,y);
        System.out.println("I am a overloaded constructor of child of derived1 class with value of z: "+ z);
    }
}

public class CWH_46_constructor_in_inheritance {
    public static void main(String[] args) {


        // Object of base1 class
//        Base1 b = new Base1();

        // Object of derived1 class
//        Derived1 d = new Derived1();// Note: constructor of the base class as well derived class is executed.

        // This will call the overloaded constructor or the base class that of the derived1 class
//        Derived1 d = new Derived1(10, 20 );


//        Childofderived cd = new Childofderived();
        Childofderived cd = new Childofderived(15, 14, 18);
    }
}
