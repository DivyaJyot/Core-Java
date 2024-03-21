package com.divya.inner;

import com.divya.inheritance.Vehicle;

public class AnonymousEx {

    public static void main(String [] ex){
       final  Vehicle veh= new Vehicle() {
            int x= 10;

            static int count=0;
            public void printDetail() {  //non-static method
                count++;
                printMe();
                Tyre.repair();
                System.out.println("printing  "+count);
            };
            public static void printMe(){ //static method
                System.out.println("hi  ");
            }

          public static class Tyre{
                public static void repair(){
                    System.out.println("repaired tyre  ");
                }

            }
        };
        veh.printDetail();
        veh.printDetail();

    }
}
