package com.divya.io;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {

    }

    static public void serialize(Object obj, String filename){
        try(var outStream=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(filename)))){
                outStream.writeObject(obj);
        }
     catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //public static
}
