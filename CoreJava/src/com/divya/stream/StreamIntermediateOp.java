package com.divya.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOp {
    public static void main(String[] args) {
        Stream<String> s= Stream.of("He ","is " ,"a ", "crazy","John","Jaiswal","Janam","Jaiswal","crazy");
       List<String> ar= s.distinct().collect(Collectors.toList());
       System.out.println("list unique---"+ar);
        Stream<String> s1= Stream.of("He ","is " ,"a ", "crazy","John","Jaiswal","Janam","Jaiswal","crazy");
        s1.skip(3).limit(4).forEach(System.out::println);
        Stream<String> s2= Stream.of("He ","is " ,"a ", "crazy","John","Jaiswal");

        Stream<String> s3= Stream.of("He ","is " ,"a ", "crazy","John","Jaiswal");
        System.out.println("sorted--");
        s3.sorted().forEach(System.out::println);
        Stream<String> s4= Stream.of("He ","is " ,"a ", "crazy","John","Jaiswal");
        System.out.println("sorted by length-");
        s4.sorted(Comparator.comparingInt((String::length)));
        List<List<String>> list1= new ArrayList<>();
        List<String> sub1=List.of("Divya","Jyoti");
        List<String> sub2= List.of("Sneh","Jyoti","sister");
        list1.add(sub2);
        list1.add(sub1);
        List<String>list2=list1.stream().flatMap(v->v.stream()).collect(Collectors.toList());
        System.out.println(list2);


    }
}
