package com.divya.com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Scrap {
    public static void main(String[] args) throws IOException{
        final InputStream fis = new FileInputStream("C:\\Users\\Divya\\Desktop\\Code\\Projects_Divya\\Core-Java\\CoreJava\\src\\com\\divya\\com\\exception\\ExceptionTest.java");
        long l = 0;
        try(fis){
            l = fis.read();//1
            l = fis.read();
             }finally{
            //below will throw IO Exception as stream is closed
            // l = fis.read();//2         }

             System.out.println(l);//
             }
        //below will throw IO Exception as stream is closed
       // l = fis.read();//3
}}
