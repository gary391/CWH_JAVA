package com.company;

interface MyCamera{
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

interface MyWifi{
    // Method
    String[] getNetworks(); // method will return an array of strings
    void connectToNetwork(String network);
}

// Class - MyCellPhone
class MyCellPhone{

    void callNumber(int phonenumber){
        System.out.println("Calling "+ phonenumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{

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

}
public class CWH_57_InterfacesExample_DefaultMethods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
//        System.out.println(ms.getNetworks());
        String[] ar = ms.getNetworks(); // A variable assignment to make it easier for iteration
//        System.out.println(ar);
        for(String item: ar){  // For each loop: For each String element in array named ar, print each element.
            System.out.println(item);
        }
    }
}
