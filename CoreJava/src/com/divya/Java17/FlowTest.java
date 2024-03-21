package com.divya.Java17;

public class FlowTest {
    public static void main(String[] args) {
        int x=11;
        while(x<15)
            if(x<10)
                if(x>8)
            System.out.println("x less than 10 greater than 8 -"+x);
            else
                System.out.println("x less than 8 "+x);
            else
                System.out.println("x greter than 10 "+x);
            x++;

    }
}
