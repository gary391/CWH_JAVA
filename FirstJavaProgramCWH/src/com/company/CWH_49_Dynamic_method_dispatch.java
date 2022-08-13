package com.company;

class Phone{

    // Method
    public void showTime (){
        System.out.println("The time is 8AM!");
    }

    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    // Method

    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class CWH_49_Dynamic_method_dispatch {
    public static void main(String[] args) {

        // object of the class

//        Phone obj = new Phone(); // Allowed
//        SmartPhone smobj = new SmartPhone();// Allowed
//        obj.name();
        // Phone obj: Super class reference obj
        // new SmartPhone(): object of Sub class SmartPhone
        // Here the SubClass object can be referenced to a Super class

        // Run time polymorphisim
        // You can only call methods that are their in the super class

        Phone obj = new SmartPhone(); // Yes it is allowed

//        SmartPhone obj2 = new Phone(); // NOT ALLOWED
        obj.showTime();
//        obj.music(); //not allowed as it not present in the super class
        obj.on(); // Objects method will executed
    }
}
