package com.divya.Records;

import com.divya.inheritance.Vehicle;

public class MainTest {

    public static void main(String[] args) {
        Car car= new Car("a2345","Divya");

        car.updateWindowSize();
        System.out.println(car.owner());
        System.out.println(car.regNo());
       // car.getNewCar();
    }
}
