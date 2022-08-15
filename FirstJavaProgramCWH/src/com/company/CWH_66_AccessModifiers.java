package com.company;

class C1{
    // Class members or properties
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    // method
    public void meth1(){
        System.out.println("Same Class Public: "+ x);
        System.out.println("Same Class protected: "+ y);
        System.out.println("Same Class default: "+ z);
        System.out.println("Same Class private: "+ a);
    }
}

class Using extends C1{
    void meth2(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z); // We can use the default with in the same package, but will not able to access as we move out. e
//        System.out.println(a);
    }
}

public class CWH_66_AccessModifiers {
    public static void main(String[] args) {
//    C1 c = new C1();
//    c.meth1();
//        System.out.println(c.x); // Accessing using the same package
//        System.out.println(c.y); // Accessing using the same package
//        System.out.println(c.z); // Accessing using the same package
//        System.out.println(c.a);// Accessing using the same package private class member is not allowed
        Using u = new Using();
        u.meth2();
    }
}
