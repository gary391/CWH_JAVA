package take2;
class Cylinder {

    private int height;
    private int radius;

    // Constructor
    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }


    // Getter
    public int getHeight(){
        return height;
    }

    public int getRadius(){
        return radius;
    }

    //setter
    public void setHeight(int height){
        this.height = height;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    // Surface are of cylinder 2* pi* r(h+r)
    public double surfaceAreaCylinder (){
        return 2 * Math.PI * radius * (radius+ height);
    }

    // volume of cylinder pi * r* r* h
    public double volume() {
        return Math.PI * radius * radius * height;
    }

}

class MyRectangle {

    // Attributes
    private int length;
    private int width;

    //Constructor
    public MyRectangle(){
       length = 4;
       width = 5;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public MyRectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

}

public class CWH2_44_PracticeSetGetterSetter {
    public static void main(String[] args) {

//        Cylinder cy = new Cylinder();
//        // Problem 1
//        cy.setHeight(10);
//        cy.setRadius(10);
//        System.out.println(cy.getHeight());
//        System.out.println(cy.getRadius());

        // Problem 2
//        System.out.println(cy.surfaceAreaCylinder());
//        System.out.println(cy.volume());

        // Problem 3
        Cylinder cy = new Cylinder(9, 12);

        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        System.out.println(cy.surfaceAreaCylinder());
        System.out.println(cy.volume());

        // Instantiate the rectangle
//        MyRectangle rec = new MyRectangle(14, 15);
//        System.out.println(rec.getLength());
//        System.out.println(rec.getWidth());

        MyRectangle rect = new MyRectangle();
        System.out.println(rect.getLength());
        System.out.println(rect.getWidth());
    }
}
