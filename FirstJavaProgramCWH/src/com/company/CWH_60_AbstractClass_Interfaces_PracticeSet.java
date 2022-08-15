package com.company;
// Q: Create an abstract class Pen with methods write() and refill() as abstract methods.
// Q: Use the Pen class from Q1 to create a concrete class FountainPen with additional method changeNib()

import javax.swing.text.LabelView;

abstract class Pen{

    abstract public void write();
    abstract public void refill();
}
class FountainPen extends Pen{
    public void write(){
        System.out.println("Writing using the pen is an art now!");
    }

    public void refill(){
        System.out.println("It's time to refill!");
    }
    public void changeNib(){
        System.out.println("It's time to change the NIB of the pen!");
    }

}
// Q: Create a class monkey with jump() and bite() methods. Create a class Human which inherits this
// Monkey class and implements BasicAnimal interface with eat() and sleep method.

class Monkey{

    // method
    public void jump(){
        System.out.println("This is a Jump method that let's you jump!");
    }
    public void bite(){
        System.out.println("This is a Bite method that let's you bite!");
    }

}
// Implement an BasicAnimal Interface

interface BasicAnimal {
    // method eat and sleep
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{

    //method
    void speak(){
        System.out.println("Hello Sir!");
    }
    @Override
    public void eat(){
        System.out.println("This is a eat method that lets you eat!");
    }
    @Override
    public void sleep(){
        System.out.println("This is a sleep method that lets you sleep");
    }
}
// Q: Create a class telephone with ring(), lift() and disconnect() method as abstract methods
// Create another class smartTelephone and demonstrate polymorphism

abstract class Telephone{

    //method
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}


class SmartTelephone extends Telephone{

    //method
    public void ring(){
        System.out.println("Ring Method!");
    }
    public void lift(){
        System.out.println("Lift Method!");
    }
    public void disconnect(){
        System.out.println("Disconnect Method!");
    }
}


interface TvRemote{
    //method

}

interface SmartTvRemote extends TvRemote{

}

class Tv implements TvRemote{
    void thisIsTv(){
        System.out.println("This is a TV!");
    }
}


    public class CWH_60_AbstractClass_Interfaces_PracticeSet {
    public static void main(String[] args) {
//        FountainPen fp = new FountainPen();
//        fp.write();
//        fp.refill();
//        fp.changeNib();
        // Q: 3
//        Human hu = new Human();
//        hu.eat();
//        hu.sleep();
//        hu.jump();
//        hu.bite();
        // Q: 5
//        Monkey m1 = new Human(); // Use Human like a monkey, so you can't use features of human.
//        m1.speak(); --> This is not allowed - As the reference is monkey which doesn't have speak method.
        // Here m1 is being referenced Monkey so, we can use it and call Monkey methods
//        m1.jump();
//        m1.bite();
//        BasicAnimal matt = new Human(); // Here matt is given reference of BasicAnimal which only have eat and sleep methods
//        matt.sleep();
//        matt.eat();
//        matt.speak(); --> NOT ALLOWED



// Q: 4

        Telephone tel =  new SmartTelephone(); // Use smartTelephone as a telephone
        tel.disconnect();
        tel.lift();

    }
}
