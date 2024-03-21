package com.divya.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> list=List.of("Divya","jyoti","sneh");
        list.forEach(v->{
            System.out.println("foeEach"+v);
        });
        for(String s: list){
            System.out.println("for "+s);
        }
        List list1=doIt(List.of("Divya","Snesh"));
        System.out.println(list1.getClass());
    }
    public static <E extends CharSequence> List<? super E> doIt(List<E> nums){
        List list= new ArrayList<>();
        list.add(0,"Divya");
        return list;
    }
}
