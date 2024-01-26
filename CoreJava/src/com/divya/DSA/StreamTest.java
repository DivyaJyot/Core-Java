package com.divya.DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        List<String> s=List.of("11","12","17");
      // List<Long> li= s.stream().mapToLong(Long::parseLong).collect(Collectors.toList());
       // List<Long> l=convertstringTolist(s,Long::parseLong);
        isNar(11512);
        //ystem.out.println(l);
    }

    public static <T,U> List<U> convertstringTolist(List<T> list, Function<T,U> function){

        return list.stream().map(function).collect(Collectors.toList());
    }

    public static boolean isNar(long num1){
        long sum=0,rem=0;
        long num=num1;
        List<Long> list =new ArrayList<>();
        while(num>0){
            rem=num%10;
            list.add(rem);
            num=num/10;
        }
        int n= list.size();
        for(int i=0;i<n;i++){
            long pow=1;
            for(int j=0;j<n;j++){
                pow=pow*list.get(i);
            }
            sum+=pow;
        }
        System.out.println(sum);
        if(sum==num1){
            return true;
        }
        return false;
   }
}
