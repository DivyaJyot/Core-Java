package com.divya.inheritance;

public class Animal {
    int head;

    static {
        System.out.println("I am static block of animal");
    }
    int name;
    Animal(int head,int name){
        this.head=head;
        this.name=name;
    }
    Animal(){
        System.out.println("Animal default constructor called");
    }
}
