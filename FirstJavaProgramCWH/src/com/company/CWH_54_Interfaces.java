package com.company;

// Interface in english is a point where two systems meet and interact.
// TV <--> Buttons <--> Human, here Button is an interface.
// Interface will have all methods as abstract. i.e. methods with empty bodies.

// We can have more than one interface whereas we can't have more than one class i.e.
// we can only extend a single class. i.e. from one parent only one child could be made.

// In case of interfaces we can use multiple interfaces to make a class.
// and then extend the class as well.

// The method and properties defined in the interface is already public.

// Following a protocol
// Why interface were created - If you want to use more than one template, you can use interfaces

interface ElectiicBike{
    final int distance=45;
    void mileage ();
}
interface Bicycle{
    //properties
    final int a = 45; // Final is already assumed.

    //Group of method - All these methods will have to be implemented.
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
// extends a Class and then Implements as well
class AvonCycle implements  Bicycle, HornBicycle, ElectiicBike{



    //When implementing method of the interfaces, those will have to made public.
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
    public void mileage(){
        System.out.println("ElectricBike Mileage is: ");
    }
}
public class CWH_54_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.blowHorn();
        System.out.println("The is distance that the bike can drive is: "+ cycleHarry.distance);
        cycleHarry.mileage();
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
