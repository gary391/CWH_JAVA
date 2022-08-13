package com.company;

import java.sql.SQLOutput;
import java.util.Map;
import java.util.SortedMap;

class MyCircle1{
    // Data members or Class Variables
    private int radius;

    // Constructor

    MyCircle1(){
        System.out.println("I am non parameterized constructor");
    }
    MyCircle1(int radius){
        System.out.println("I am a parameterized constructor");
        this.radius =radius;
    }
    // accessor or getter method
    public int getRadius(){
        return radius;
    }
    //settor or mutator
    public void setRadius(int radius){
        this.radius =radius;
    }

    //method area of circle pie * r^2
    public double myCircleArea(){
        return Math.PI*this.radius*this.radius;
    }

}
class MyCylinder extends MyCircle1{

    // Data member of Cylinder class
    private int height;

    // Constructor
    MyCylinder(int radius, int height){
        super(radius);
        System.out.println("I am cylinder parameterized constructor");
        this.height= height;
    }

    // method pie*h*r^2
    public double myCylinderVolume(){
        return Math.PI*this.height* this.getRadius()*this.getRadius();
    }
}

// Class rectangle

class Myrectangle{

    private int len;
    private int bre;

    //Constructor
    public Myrectangle(int len, int bre){
        System.out.println("I am a parameterized constructor in rectangle");
        this.len =len;
        this.bre =bre;
    }
    // getter
    public int getLen(){
        return len;
    }
    public int getBre(){
        return bre;
    }

    //Setter
    public void setLen(int len){
        this.len =len;
    }
    public void setBre(int bre){
        this.len =bre;
    }

    // method
    public int myrectangearea(){
        return len*bre;
    }

}
class Cuboid extends Myrectangle{
    //Class variable or data members
    private int height;

    // Constructor
    public Cuboid(int len, int bre, int height){
        super(len, bre);
        this.height =height;
    }

    //Getter and setter
    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height=height;
    }

    // method
    public int mycuboidvolume (){
        System.out.println("The height is "+ this.height);
        System.out.println("The volume of the cuboid is: ");
//        return (this.height*this.getLen()*this.getBre());
        return (this.getLen()*this.getBre()*this.height);
    }

    public int mycuboidarea(){
        return 2*((this.getBre()*this.getLen())+(this.getBre()*this.height)+(this.getLen()*this.height));
    }
}

public class CWH_52_PracticeSetCh10 {
    public static void main(String[] args) {

        // Create a class circle and use inheritance to create another class cylinder from it

//        MyCircle1 c = new MyCircle1(10);
//        System.out.println(c.myCircleArea());
//
//        MyCylinder cy = new MyCylinder(10, 10);
//        System.out.println(cy.myCylinderVolume());

//        Myrectangle myrect= new Myrectangle(10, 20);
//        System.out.println(myrect.myrectangearea());
        Cuboid mycuboid = new Cuboid(10, 10, 10);
//        Cuboid mycuboid = new Cuboid(10, 20, 30);
//        System.out.println(mycuboid.mycuboidarea());
//        System.out.println(mycuboid.mycuboidvolume());
        mycuboid.setHeight(10);
        System.out.println(mycuboid.getHeight());
        mycuboid.setLen(10);
        System.out.println(mycuboid.getLen());
        mycuboid.setHeight(100);
        System.out.println(mycuboid.getHeight());
        System.out.println(mycuboid.mycuboidvolume());

    }


}
