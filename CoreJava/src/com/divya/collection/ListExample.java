package com.divya.collection;

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
    }
}
