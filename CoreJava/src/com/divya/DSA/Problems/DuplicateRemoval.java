package com.divya.DSA.Problems;

import java.util.HashSet;
import java.util.Iterator;

public class DuplicateRemoval {
    public static void main(String[] args) {

        String out = removeDuplicate("GeekForGeeks");
        System.out.println(out);
    }

    public static String removeDuplicate(String s){
        int n= s.length();
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<n;i++){
            Character ch= s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }


        return sb.toString();
    }
}
