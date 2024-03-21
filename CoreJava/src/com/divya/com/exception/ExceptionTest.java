package com.divya.com.exception;

import java.io.IOException;


public class ExceptionTest {
    public static void main2(String[] args) {
        Float f = null;
        try{
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s);
            System.out.println(""+i);
        } catch(Exception e){
            System.out.println("trouble : "+f); }

    }
    public static void main(String[] args) {
        ExceptionTest tc= new ExceptionTest();
        try{
            tc.m1();}
        catch(Exception me){
            System.out.println(me);
        }

    }
    public void m1() throws Exception{
        try {
            throw new NullPointerException();
        }
        catch(NullPointerException ne) {
            throw new MyException();
        }
        finally {
            System.out.println("about to throw runtime");
            throw new RuntimeException();
        }
    }
    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }
}

