package take2;
class MyMainEmployee{
    private int id;
    private String name;

    private int salary;

    // Constructor

    public MyMainEmployee(){
        id = 45;
        name = "Your-name-here";
    }

    // Overloaded Constructor
    public MyMainEmployee(int myId, String myName){
        id = myId;
        name = myName; // Here we are setting the value of the name based on the input.
    }

    public MyMainEmployee(String myName){
        id = 1;
        name = myName; // Here we are setting the value of the name based on the input.
    }

    public MyMainEmployee(int myId, String myName, int mySalary){
        id = myId;
        name = myName; // Here we are setting the value of the name based on the input.
        salary = mySalary;
    }
    // Getter and Setter

    // setter
    public void setName(String n){
        name = n;
    }

    // setter for id
    public void setId(int i){
        if (i < 0) {
            System.out.println("Please enter positive numbers: " + i );
        } else {
            id = i;
        }

    }
    // Getter for name
    public String getName(){
        return name;
    }

    // getter for id
    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

}
public class CWH2_42_Constructors {
    public static void main(String[] args) {
        /* When ever you create an object of a class the constructor is
         automatically executed.
          - There is no return value
          -
        */
        MyMainEmployee harry = new MyMainEmployee();
        System.out.println(harry.getId());
        System.out.println(harry.getName());
//        MyMainEmployee harry = new MyMainEmployee("ProgrammingWithHarry", 12);
//        MyMainEmployee harry = new MyMainEmployee("harryminator");
//        MyMainEmployee harry = new MyMainEmployee(12, "harryminator", 120000);
//        MyMainEmployee harry = new MyMainEmployee();
//        harry.setId(10000);
//        harry.getId();
//        harry.setName("CodeWithHarry");
//        harry.getName();
//        System.out.println(harry.getId());
//        System.out.println(harry.getName());
//        System.out.println(harry.getSalary());

    }
}
