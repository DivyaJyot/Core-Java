package com.divya.Java17;

public class Datatype {
    public static void main(String[] args) {
        dataType();
        int[] a= new int[]{100,2,3,4};
        int[] b= {10,11,12,0};
        System.out.println(a[(a=b)[3]]);
        System.out.println(a[0]);
    }



    private static void dataType() {
        int i = 1234567890;
        float f = i;
        //Actually it prints -46. This is because the information was lost during the conversion from type int to type float as values of type float are not precise to nine significant digits. Note: You are not required to know the number of significant digits that can be stored by a float for the exam. However,
        // it is good to know about loss of precision while using float and double.
        System.out.println(i - (int)f);
        long l= Integer.valueOf(2);
        String s= String.valueOf(2);
        float fi= 15;

        int[] x= {1,2,3,4};
        var y= new int[]{1,2,3,4};
        String[] z= {"1","2",null};
        System.out.println(x[3]);
        System.out.println(z[2]);
    }
}
