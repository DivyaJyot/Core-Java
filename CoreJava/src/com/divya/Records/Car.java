package com.divya.Records;

public  record Car(String regNo, String owner) implements OpenableRoof {
    static int serial=1;


    @Override
    public void updateWindowSize() {
        System.out.println("hi I am openable");
    }

    record Wheel(int count , int radius){
        Wheel Wheel(){
            return new Wheel(4,3);
        }

        Wheel(int count,int radius){
            this.count=count;
            this.radius=radius;
        }

    }
}
