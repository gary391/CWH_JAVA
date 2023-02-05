package com.company;

// This is the superClass or Parent Class or Base Class
// Access modifier is default
class Base{

//    public int x;
    private int x;

    // setter method
    public void setX(int x){
        System.out.println("I am in base class & setting x now");
//        x = x; // Here if we don't uses this, this expression will give us "0" as they have the same name.
        this.x = x; // Here if we don't uses this, this will through an error.
    }


    //getter method

    public int getX(){

        return x;
    }

    // method
    public void printMe(){

        System.out.println("I am a constructor!");
    }


}

// Using inheritance to extend the new (derived) class from the base class
// and will be available here as well. i.e. (properties and methods)

// Child Class or Sub Class
class Derived extends Base {

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


public class CWH_45_Inheritance {
    public static void main(String[] args) {


        // Inheritance
        // Face features between parents and children

        // Creating an object of the base class
        Base b = new Base();
        b.setX(4); // setting a value of x (setter method is in the base class)
        System.out.println(b.getX()); // getter method is in the base class

        // from the base class we can't access setter and getter method of the derived callas
//        b.setY(45); // This will give error

        // creating an object of the derived class
        Derived d = new Derived();
        d.setX(54); // setting a value of x (setter method is in the base class)
        System.out.println(d.getX()); // getter method is in the base class

        d.setY(94); // setting a value of y (setter method is in the base class)
        System.out.println("Getting Y: "+ d.getY()); // getter method is in the base class


    }
}
