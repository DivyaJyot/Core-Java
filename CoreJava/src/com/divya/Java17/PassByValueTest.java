package com.divya.Java17;

public class PassByValueTest {

    int x=10;
    public static void main(String[] args) {
        PassByValueTest p= new PassByValueTest();
        p.x=12;
        String s= "Hello";
        int[] ar={1,2,3,4};
        StringBuilder sb= new StringBuilder("traffic");
        p.getUpdated(p.x,s,ar,sb);
        System.out.println(p.x);
        System.out.println(sb);
        System.out.println(ar[0]);
    }

   void  getUpdated(int x,String s, int[] ar,StringBuilder sb){
            x=1000;
            System.out.println(x);
            int[] ar2={90,2,5,7};
            ar=ar2;
            ar[0]=7;
            s=s+" world";
            sb= new StringBuilder("high   ");
            sb.append("jam");
            System.out.println(s);
    }
}
