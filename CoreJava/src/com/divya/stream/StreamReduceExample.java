package com.divya.stream;

import java.util.stream.Stream;

public class StreamReduceExample {
    public static void main(String[] args) {
        Stream<String> s= Stream.of("He ","is " ,"a ", "crazy");
        //System.out.println(s.reduce(String::concat));
        //System.out.println(s.reduce("Heloo!!!!",(a,c)->a+c),(b,d)->b+d));

        int str= s.reduce(10,(a,c)->a+c.length(),(b,d)->b+d);
        System.out.println(str);
    }
}
