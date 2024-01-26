package com.divya;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryWithResource {
    public static void main(String[] args) {

        String path="C:\\Users\\Divya\\Desktop\\Divya\\Learning\\Books\\QuickSort.java";
        long count= readFile(path);
    }

    public static long readFile(String path){
        try{

            long count =Files.lines(Paths.get(path)).filter(v->v.contains("partition")).count();
            System.out.println(count);
            return count;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Inside finally");
        }
        return 5;
    }
}
