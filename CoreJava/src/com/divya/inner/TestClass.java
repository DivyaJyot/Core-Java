package com.divya.inner;

public class TestClass {

        static int si = 10;   int ii = 20;
        //
       // Since method inner() is a static method, only si and fai are accessible in class Inner. Note that ai and ii are not accessible.
   // If method inner() were a non - static method, ii would have been accessible. If the line ai = 31; did not exist, ai would have been accessible.
        public static void inner()
        {
            int ai = 30; //automatic variable
            ai = 31; //ai is not effectively final anymore.
            final int fai = 40; //automatic final variable
            class Inner
            {
                public Inner()
                {   System.out.println(si+"    "+fai);      }
            }
            new Inner();
        }
        public static void main(String[] args)
        {     TestClass.inner();       }

}
