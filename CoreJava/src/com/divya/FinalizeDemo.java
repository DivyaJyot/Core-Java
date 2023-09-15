package com.divya;

public class FinalizeDemo {

    protected void finalize(){
        System.out.println("gc called called finalize-");
    }

    public static void main(String[] args) {
        FinalizeDemo f1=new FinalizeDemo();
        FinalizeDemo f2= new FinalizeDemo();
        f1=null;
        f2=null;
        System.gc();
        System.out.println("end of code");
    }

}
