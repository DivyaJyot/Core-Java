package com.divya.inheritance;

public class Laptop implements  Computer{

    @Override
    public void getButton() {
        Computer.super.getButton();
        System.out.println("sub button");
    }
        public static void main(String[] var){
        new Laptop().getButton();
        }

}
