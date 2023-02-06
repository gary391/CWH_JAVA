package take2;
/*
Access modifiers - Where a property method is accessible.

There are four type pf access modifier in Java
1. Private
2. Default
3. Protected
4. Public

- Used during inheritance or when you are trying to access the property of a class from another class.

Getter and setter


 */
class MyEmployee{
    private int id;
    private String name;

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

}
public class CWH2_40_AccesModifier_Constructor {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();

//        harry.setId(45);  // As the id is privite we can't access this directly
        harry.setId(-2);  // As the id is privite we can't access this directly
        System.out.println(harry.getId());
        harry.setName("codewithharry"); // As the name is private we can't access this directly.
        System.out.println(harry.getName());
    }
}
