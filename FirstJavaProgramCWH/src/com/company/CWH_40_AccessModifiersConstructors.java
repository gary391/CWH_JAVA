package com.company;



/* Access modifier - Way to access property and methods in one class by another class,
1. Private
2. Default // No need to mention anything
3. Protected
4. Public


Why do you need getter setter instead  just could have made the property as public or default ?

- We can set validation and avoid incorrect initialization. Example: name of a person can't be a number
- Phone number can't have special characters



* */
class MyEmployee{

    private int id;
    private String name;

    //Methods

    // setName
    public void setName(String n){
        name = n; // No return value for a setter
//        this.name = n; // No return value for a setter
    }

    //getName
    public String getName(){
        return name;
    }

    // setId
    public void setId(int i){
        this.id = i;
    }

    // getId
    public int getId(){
        return id;
    }


}


class MyCircle {

    // Properties/Attribute
    private float radius;



    // method

    // setRadius
    public void setRadius(float r){
//        radius = r;
        if (r <10f){
            System.out.println("Radius must be greater than 10!!!");
        }else{
            radius = r;
        }
    }

    // getRadius
    public float getRadius(){
        return radius;
    }





    // myarea

    public double myarea(){
        return 3.14*radius*radius;

    }


    // myperimeter

    public double myperimeter(){
        return 2*3.14*radius;






    }
}

public class CWH_40_AccessModifiersConstructors {
    public static void main(String[] args) {


        MyEmployee gaurav = new MyEmployee();
//        gaurav.id = 45;   // Here the properties are not accessible directly as they are private, instead use methods
//        gaurav.name= "CodeWithGaurav"; // Here the properties are not accessible directly as they are private. instead use method
//        gaurav.setName("CodeWithGaurav");
//        System.out.println(gaurav.getName());
//        gaurav.setId(444);
//        System.out.println(gaurav.getId());

        MyCircle mcircle  = new MyCircle();
        mcircle.setRadius(10);
        System.out.println(mcircle.getRadius());
        System.out.println(mcircle.myarea());
        System.out.println(mcircle.myperimeter());



    }
}
