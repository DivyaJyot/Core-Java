package com.divya.functionalInterfaces;

public class Snake extends Reptile{
    public void run(){
        System.out.println("snake is running");
    }
@Override
    public void eat(){
        System.out.println("eating from reptile");
        //return "abc";
    }
}
