package com.divya.collection.list;

import java.util.ArrayList;
import java.util.List;

public class LisExample {
    //arraylist checks order
    public static void main(String[] args) {
        List<String> name = List.of("Divya", "Jyoti", "nani");
        //name.get(name.size());
        List<String> name2 = new ArrayList<String>();
        name2.add("Divya");
        name2.add("Jyoti");
        name2.add("nani");
        //  name.remove("Jyoti");
        name2.add("Jyoti");
        name.add("hello");
        name.forEach(v -> System.out.println(v));

        for (Object str : name) {
            System.out.println(str.getClass());
        }
        System.out.println(name.equals(name2));
    }

}
