package com.company;
// method overloading - same method name but different parameters
class A{
    // Data Members
    public int a;
    public int harry(){
        return 4;
    }
    // Method 2 of Class A
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{

    // Method 2 of class B
    @Override
    // Override annotation (Same argument list )
    // Helps us to identify that this method has been overridden
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class CWH_48_MethodOverRiding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        // Here when we are calling the method 2 of the class B, which has overridden the meth2 of class A
         b.meth2();

    }
}
