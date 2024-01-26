package com.divya.stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollectExample {
    public static void main(String[] args) {
        Stream<String> data= Stream.of("I ","am","ja","sa");
        //TreeSet<String> set=data.collect(Collectors.toCollection(TreeSet::new));
       Set<String> set1=data.collect(Collectors.toSet());
        System.out.println(set1);

    }

}
