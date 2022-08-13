package com.company;

class Myclass{

    private int a;

    // getter method
    public int getA(){
        return a;
    }

    // constructor with parameter, is acting as setter here.
   // Here this is a reference to the class variable that is available in the class
    Myclass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}


class Mericlass extends Myclass{

    //constructor
    Mericlass(int c){
        // using super we are able to call the constructor with a parameter in the parent class.
        super(c);
        System.out.println("I am a constructor!");
    }
}
public class CWH_46_this_and_super {
    public static void main(String[] args) {

        // Object of a class
        Myclass m = new Myclass(55);
        Mericlass meri = new Mericlass(45);
        System.out.println(m.getA());



    }
}
