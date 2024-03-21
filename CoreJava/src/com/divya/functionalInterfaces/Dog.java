package com.divya.functionalInterfaces;

public class Dog implements Animal,FourLimber {
    public void run()
        {
            System.out.println("run from 4limber");
        }
    public void eat(){
        System.out.println("Dog eating ");
    }

}
