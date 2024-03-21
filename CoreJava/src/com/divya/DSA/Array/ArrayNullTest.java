package com.divya.DSA.Array;

import com.mysql.cj.xdevapi.JsonParser;

public class ArrayNullTest
{
    public static void main(String[] args) {
        Integer[] ar={1,2 ,null};

        Integer x=ar[2];
        int y=3;
        do{
            y++;
        }while(false);
        y=3;
        boolean z= y++==3 && --y==3;
        System.out.println(ar[2]);

    }

}
