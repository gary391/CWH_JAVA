package take2;
/*
Create an Employee class
 */
class EmployeeOOPSPS {

    // Attributes or Properties
    int salary;
    String name;

    // method
    public int getSalary (){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{

    public void getRinging(){
        System.out.println("Ringing!!!");
    }

    public void getVibrating(){
        System.out.println("Vibrating!!");
    }
}

class Sqaure{
    int side;

    public int area(int side){
        return side *side;
    }

    public int perimeter(int side){
        return  4*side;
    }

}

class Rectangle{
    int length;
    int width;

    public int area(int length, int width) {
        return (length * width);
    }

    public int perimeter(int length, int width){
        return (2*(length+ width));
    }
}

class TommyVecetti{

    public void hitting(){
        System.out.println("Hitting...");
    }
    public void running(){
        System.out.println("Running...");
    }
    public void firing(){
        System.out.println("Firing...");
    }
}

class Circle{

    float r;

    public float area (float r){
        return 3.14f * (r * r);
    }

    public float perimeter(float r) {
        return 2 * 3.14f * r;
    }
}

public class CWH2_39_oops_ps {
    public static void main(String[] args) {
        EmployeeOOPSPS rohan = new EmployeeOOPSPS();
        rohan.name = "Rohan MeraName";
        rohan.salary = 12000;
        System.out.println("My name was "+ rohan.getName());
        rohan.setName("Rohan Sharma");
        System.out.println("Now my name is "+ rohan.name+ ", my salary is "+ rohan.getSalary());

        // Cellphone instance
        CellPhone cell = new CellPhone();
        cell.getRinging();
        cell.getVibrating();

        // Sqaure instance
        Sqaure square = new Sqaure();
        square.side = 10;
        System.out.println("The Area of a sqaure is :" + square.area(10));
        System.out.println("The Perimeter of a sqaure is :" + square.perimeter(10));

        // Rectangle Instance

        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 20;
        System.out.println("The area of a rectangle is: "+ rectangle.area(10, 20));
        System.out.println("The perimeter of a rectangle is: "+ rectangle.perimeter(10, 20));

        // TommyVecetti
        TommyVecetti tv = new TommyVecetti();
        tv.hitting();
        tv.running();
        tv.firing();

        //circle
        Circle cr = new Circle();
        cr.r = 10;
        System.out.println(cr.area(cr.r));
        System.out.println(cr.perimeter(cr.r));
    }
}
