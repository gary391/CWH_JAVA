package com.company;

class Cylinder {

    // property
    private float radius;
    private float height;

    // Methods

    // setRadius
    public void setRadius(float r) {
        radius = r;
    }

    // setHeight
    public void setHeight(float h) {
        height = h;
    }

    // getRadius
    public float getRadius() {
        return radius;
    }

    // getHeight
    public float getHeight() {
        return height;

    }

    public double volume(){
        return 3.14 * height * radius *radius;
    }

    public double surfaceArea(){
        return 2* 3.14 * (radius * height) + 2 * 3.14 * (radius * radius);
    }

    //constructor

    public Cylinder(float myradius, float myheight ){
        radius = myradius;
        height = myheight;
    }

}

public class CWH_44_PracticeSetAccessModifier {
    public static void main(String[] args) {

//        Cylinder mycylinder = new Cylinder();
        Cylinder mycylinder = new Cylinder(9, 12);
//        mycylinder.setHeight(12);
//        mycylinder.setRadius(9);
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.getRadius());

        // volume v = 3.14 * h * r *r
        System.out.println("Volume of a cylinder: "+mycylinder.volume());

        // Surface area = 2*3.14*r*(r +h)
        System.out.println("Surface area of cylinder: " + mycylinder.surfaceArea());



    }
}
