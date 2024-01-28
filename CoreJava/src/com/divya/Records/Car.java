package com.divya.Records;

public record Car(String regNo, String owner) {

    public static void getNewCar(){
        System.out.println("cara called");

    }
}
