package com.company;

// Abstract class
// Abstract method, is declared without an implementation.

// Abstract class that has Abstract method
// One Abstract method makes the whole class as Abstract.

// Abstract class is used for - Making other abstract classes
// We can't make an object of an abstract class, as it is not a concrete class.

abstract class Parent2{

    // constructor
    public Parent2(){
        System.out.println("I am a constructor of class Parent2");
    }

    // Method
    public void sayHello(){

        System.out.println("Hello!");
    }
    abstract public void greet(); // different people have different way to greet -
    abstract public void greet1(); // different people have different way to greet
}
//inherit
// Note we can't extend from a parent abstract class without using abstract key word or creating a
// Abstract method in the parent class. ?? What is the meaning of creating an abstract method in the
// parent class.

// Make sure all methods in the Abstract class should be overriden to make a concrete class.

class Child2 extends Parent2{

    @Override
    public void greet(){
        System.out.println("Good Morning!");
    }
    @Override
    public void greet1(){

        System.out.println("Namaste!");
    }
}


abstract class Child3 extends Parent2{

    public void th(){
        System.out.println("I am good!");
    }
}

public class CWH_53_AbstractClasses {

    public static void main(String[] args) {

//        Parent2 p = new Parent2(); // This is not possible with implementing the abstract method
        Child2 c = new Child2(); // Child2 is concrete class thus can be instantiated.
//        Child3 c3 = new Child3(); // This is not possible with implementing the abstract method -- error
    }
}
