package com.divya.inheritance;

public interface Computer {
    default void getButton(){
    System.out.println("super button");
    }
    private void getMonitor(){

    }


}
