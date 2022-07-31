package com.company;


// If you want to make another class in the same file you can not use public key word. You will have to create
// a class without the public key word.

class Employee{
    int id;
    int salary;
    String name;


    // method
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);

    }
    public int getSalary(){
        return salary;
    }
}


public class CWH_38_customClass {
    public static void main(String[] args) {

        System.out.println("This is our custom class");

        Employee harry  = new Employee(); // Instantiating a new Employee Object using a new keyword
        Employee john = new Employee(); // Instantiating a new Employee Object using a new keyword



        // Setting Attributes for harry

        harry.id = 12;
        harry.name = "CodeWithHarry";
        harry.salary = 34000;

        // Setting Attributes for john

        john.id = 22;
        john.name = "John Cena";
        john.salary = 12000;


        // Printing the attributes

//        System.out.println(harry.id);
//        System.out.println(harry.name);

        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println("My salary is " + salary);

    }
}
