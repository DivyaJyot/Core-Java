package com.divya.inheritance;

public class InhertianceTest {
    public static void main(String[] args) {
        Vehicle a= new Vehicle();
       System.out.println( "wheelcount "+a.wheelCount);
        System.out.println( "size "+a.size);
        Vehicle b =new Car();
        Car c = new Car();
        ((Vehicle)b).printDetail();
        System.out.println(((Vehicle)b).engine);
        System.out.println(((Car)b).engine);
        System.out.println("b.engine-"+b.engine);
        System.out.println("c.engine-"+c.engine);
        b.printDetail();
        c.printDetail();

        a.printDetail();
    }
}
