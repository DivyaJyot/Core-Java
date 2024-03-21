package com.divya.inheritance;

public class Mammal extends Animal{
    int horn;
    static {
        System.out.println("I am static block of mammal");
    }
    static int limb=4;
    Mammal(int horn){
        //super(3,4);
        this.horn=horn;
    }
    public static void main(String args[]){
        Mammal mammal= new Mammal(5);
    }

}
