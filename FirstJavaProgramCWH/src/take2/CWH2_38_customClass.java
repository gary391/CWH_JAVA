package take2;

/*
In a Java class there can be one public class.

 */
class Employee{ // We can't make this public as this is not allowed as per the Java convention

    //Attributes
    int id;
    int salary;
    String name;

    // method
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }

    // Get Salary method
    public int getSalary(){
        return salary;
    }
}


public class CWH2_38_customClass {

    public static void main(String[] args) {
        System.out.println("This is our custom class");

        // Object of Employee class - Instantiating a new Employee object

        // Printing the attributes
        Employee rohan = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object
        rohan.id = 1234;
        rohan.salary = 34;
        rohan.name = "Rohan John";

        // Printing the attributes
        john.id = 12;
        john.salary = 13;
        john.name = "John Khanna";

//        System.out.println(rohan.id); // This is just printing the value that is being set
//        System.out.println(rohan.name);
        // Here I am calling the printdetails method on rohan object.

//        rohan.printDetails();
        System.out.println("The salary of "+ rohan.getSalary());
//        john.printDetails();
        System.out.println("The salary of "+ john.getSalary());

    }
}
