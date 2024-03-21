package com.divya.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class mapExample {
    public static void main(String[] args) {
        Map<Integer,String> map1= new HashMap<>();
                map1.put(3,"Ram");
                map1.put(4,"Syamchandra");
        Map<Integer,String> map= Map.of(3,"Ram",4,"Syamchandra",5,"divya");
        //map2.put(5,"rama"); unsupported operation- immutable map
        Map<Integer,String> map2=Map.ofEntries(
                Map.entry(1,"Divya"),
                Map.entry(2,"Sneh")
        );
        //map2.put(5,"rama"); unsupported operation- immutable map
        map1.replaceAll((k,v)->v.length()>5?v:"hello");
        map.entrySet().forEach(v->{
            System.out.println(v.getKey()+"____"+v.getValue());
        });
        System.out.println();
        BiFunction<String,String,String> logic= (name1,name2)->name1.length()>3?name1:name2;
        map1.merge(1,"aashvi",logic);
        map1.entrySet().forEach(v->{
            System.out.println(v.getKey()+"____"+v.getValue());
        });
    }

}
