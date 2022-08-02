package com.company;

class MyMainEmployee{

    private int id;
    private String name;


    // setName Setter

    public void setName(String n){
        this.name = n;
    }
    //getName getter
    public String getName(){
        return name;
    }

    // setId Setter
    public void setId(int i){
        this.id = i;
    }

    // getId Getter
    public int getId(){
        return id;
    }

    // constructor i.e. method with the same name as that of the class
    // There is no return value
    // note Here we are seeing constructor overloading
    public MyMainEmployee(){
        id = 45;
        name = "Your Name Here!";
    }

    // Constructor with arguments
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
}

public class CWH_42_constructor {
    public static void main(String[] args) {

        // Creating an object of MyMainEmployee class in the main method of the class CWH_42_constructor
        // As soon as a new object is created it will call the constructor or the constructor will be
        // invoked automatically

        MyMainEmployee gaurav = new MyMainEmployee("ProgrammingWithGaurav", 12);
//        MyMainEmployee gaurav = new MyMainEmployee();
//        gaurav.setId(444);
//        gaurav.setName("CodeWithGaurav");
        System.out.println(gaurav.getId());
        System.out.println(gaurav.getName());

        // Constructor in Java

        /*
        A member function used to initialise an object while creating it.
        * */


    }
}
