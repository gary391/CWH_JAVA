package com.company;

//Inheritance in interfaces

interface sampleInterface{

    //method
    void meth1();
    void meth2();
}
// extending interface from existing interfaces, but you can't create classes by extending interfaces.

interface childSampleInterface extends  sampleInterface{

    //method
    void meth3();
    void meth4();
}
interface grandchildSampleInterface extends childSampleInterface{
    //method
    void meth5();
    void meth6();
}
class MySampleClass implements grandchildSampleInterface{

    //method
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    }
    public void meth5(){
        System.out.println("meth5");
    }
    public void meth6(){
        System.out.println("meth6");
    }
}

public class CWH_58_Inheritance_Interface {
    public static void main(String[] args) {

        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        obj.meth5();
        obj.meth6();
    }
}
