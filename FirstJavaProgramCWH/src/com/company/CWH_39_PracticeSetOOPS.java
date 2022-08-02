package com.company;

// In the same package class name should be unique.

class Employee1{

    int salary;
    String name;



    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    // This is method to set a value/Name
    public void setName(String n){
        name = n;
    }
}


class CellPhone{

    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating...");
    }

    public void callFriend(){
        System.out.println("Calling  your friend..");
    }

}

class Square {


    float side;


    //methods

    public float area(){
        return side*side;
    }


    public float perimeter(){
        return 4*side;
    }
}


class Rectangle {

    float length;
    float width;

    // method

    public float area(){
        return length*width;
    }


    public float perimeter(){
        return 2*(length+width);
    }

}


class TommyStar{

    public void hitting(){
        System.out.println("hitting...");
    }

    public void running(){
        System.out.println("running...");
    }

    public void firing(){
        System.out.println("firing...");
    }
}


class Circle{
    float radius;

    public double area(){
        return 3.14*radius*radius;
    }

    public double perimeter(){
        return 2*3.14*radius;
    }
}

public class CWH_39_PracticeSetOOPS {
    public static void main(String[] args) {


        /*

        Employee1 harry = new Employee1();
        harry.setName("CodeWithHarry");
        harry.salary = 233;

        System.out.println(harry.getSalary());
        // Get method to get the name
        System.out.println(harry.getName());


        // Problem 2

        CellPhone iphone = new CellPhone(); // iphone is object created from the CellPhone Class

        iphone.callFriend();
        iphone.vibrate();
        iphone.ring();

        */

        /* // Problem 3  Square class

        Square mysquare = new Square();

        mysquare.side = 20;
        System.out.println(mysquare.area());
        System.out.println(mysquare.perimeter());
        */

        // Problem 4 Rectangle class

        /*
        Rectangle myrectange = new Rectangle();

        myrectange.length = 10;
        myrectange.width = 20;
        System.out.println(myrectange.area());
        System.out.println(myrectange.perimeter());
        */

        // Problem 5 TommyStar

        /*
        TommyStar mytommy = new TommyStar();
        mytommy.firing();
        mytommy.hitting();
        mytommy.running();
        */

        // Problem 6 Circle class

        Circle mycircle = new Circle(); //
        mycircle.radius = 5;
        System.out.println(mycircle.area());
        System.out.println(mycircle.perimeter());

    }
}
