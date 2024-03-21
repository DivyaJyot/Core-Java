package com.divya.stream;

import java.util.Optional;

public class OptionEx {
    public static void main(String[] args) {
        Optional<Double> price = Optional.ofNullable(getPrice("155"));
        Double String = price.orElse(getPrice("222"));
        Double Int = price.orElseGet(()->getPrice("3333"));
        Double Null = price.orElseGet(()->getPrice("3333"));
        System.out.println(Int);
        System.out.println(String);
        System.out.println(Null);

    }

    public static Double getPrice(String count){
        Double y=10.0;
        Float f=10.0f;

        if(Integer.parseInt(count)<1000){
            return  null;
        }
        return y;
    }
}

