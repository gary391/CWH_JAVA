package com.company;

interface MyCamera2{
    // method
    void takeSnap();
    void recordVideo();

    // private method which can't be used in the extended class but we can use it the default method
    private void greet(){
        System.out.printf("Good Morning!!!\n");
    }
    // Using default key word you can implement methods in interfaces,
    // these can also be overridden in subsequent classes. Note: If the method is overridden in the
    // extended class this will not work.
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface MyWifi2{
    // Method
    String[] getNetworks(); // method will return an array of strings
    void connectToNetwork(String network);
}

// Class - MyCellPhone
class MyCellPhone2{

    void callNumber(int phonenumber){
        System.out.println("Calling "+ phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2{

    // Method implementation
    public void takeSnap(){
        System.out.println("Taking a snapshot!");
    }
    public void recordVideo(){
        System.out.println("Now recording a video...");
    }
//    public void record4KVideo(){
//        System.out.println("Now Recording in 4K...");
//    }

    public String[] getNetworks(){
        System.out.println("Getting the list of available networks");
        String [] networkList = {"Harrywifi", "Garrywifi", "Anjali5G"}; // array named networkList
        return networkList;
    }

    public void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }
}

public class CWH_59_Polymorphism_in_interface {
    public static void main(String[] args) {
        // This is a smartphone but, use it is a camera. SO you can only use method mentioned in camera
        MyCamera2 cam1 = new MySmartPhone2();
//        cam1.getNetworks(); --> not allowed as you only wanted to use cam using a MySmartPhone2 object
//        cam1.sampleMeth(); --> Not allowed as you only want to use cam using a MySmartPhone2 object.
        cam1.record4KVideo();
        System.out.println("Calling method from the ");
        MySmartPhone2 s = new MySmartPhone2();
        s.record4KVideo();
        s.sampleMeth();
        s.getNetworks();
        s.callNumber(23232322);


    }
}
