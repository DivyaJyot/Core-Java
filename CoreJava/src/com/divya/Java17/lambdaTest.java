package com.divya.Java17;

public class lambdaTest {
    public class TestClass {
        interface Doer {
            String doIt(int x, String y);
        }

        public static void main(String[] args) {
            Doer d = (int a, String b)->b.substring(0, a);
            System.out.println(d.doIt(2, "12345"));
        }
    }
}
