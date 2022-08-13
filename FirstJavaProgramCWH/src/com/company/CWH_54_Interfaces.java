package com.company;

// We can have more than one interface whereas we can't have more than one class i.e. we can only extend
// a single class. i.e. from one parent only one child could be made.

// In case of interfaces we can use multiple interfaces to make a class.
// and then extend the class as well.

// The method and properties defined in the interface is already public.

// Following a protocol
// Why interface were created - If you want to use more than one template, you can use interfaces


interface Bicycle{
    //properties
    final int a = 45; // Final is already assumed.

    //Group of method
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    //properties
    final int b = 145; // Final is already assumed.

    //Group of method
    void blowHornk3g();
    void blowHornk4g();
}
// Suppose we have a Cycle class then
// class AvonCycle extends Cycle implements Bicycle, HornBicycle.
class AvonCycle implements Bicycle, HornBicycle{

    //
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    // Here all the method of the interface will have to be public
    public void applyBrake(int decrement){
        System.out.println("Applying Brake!");
    }
    // Here all the method of the interface will have to be public
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp!");
    }
    // Here all the method of the interface will have to be public
    public void blowHornk3g(){
        System.out.println("Go 3G!!");
    }
    // Here all the method of the interface will have to be public
    public void blowHornk4g(){
        System.out.println("Go 4G!!");
    }
}
public class CWH_54_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.blowHorn();
        cycleHarry.applyBrake(1);
        // You can create properties in separate interfaces example a and b.
        System.out.println(cycleHarry.a);
        System.out.println(cycleHarry.b);
        // You cannot modify the properties in interfaces as they are final.
//        cycleHarry.a =455; // Will give an error
        cycleHarry.blowHornk3g();
        cycleHarry.blowHornk4g();
    }
}
