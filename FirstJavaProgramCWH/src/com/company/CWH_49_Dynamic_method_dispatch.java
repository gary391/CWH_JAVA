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
    @Override
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

        // Run time polymorphisim - Object creation will happen at the run time.
        // You can only call methods that are their in the super class or common

        // SUPER OBJ = NEW SUB() -->
        // REFERENCE HAI PHONE KA BUT OBJECT IS OF SMARTPHONE
        // OBJECT OF SMART IS BEING REFERRED WITH REFERENCE OF PHONE
        // ALL METHODS OF PHONE ARE ALLOWED OR THAT ARE COMMON WITH SMARTPHONE BUT
        // SMARTPHONE METHODS ARE NOT ALLOWED.
        Phone obj = new SmartPhone(); // Yes it is allowed

//        SmartPhone obj2 = new Phone(); // NOT ALLOWED
        obj.showTime();
//        obj.music(); //not allowed as it not present in the super class
        obj.on(); // Objects method will be executed
    }
}
