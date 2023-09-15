package com.divya.annotation;

import OCJP17.Person;

import java.lang.annotation.Repeatable;



    @interface  Human{};

    @interface OnWeb{
        int startTime();
        int hourPerDay();
        int PEEK_IN_TIME=19;
        public static final int PEAK_END_TIME=29;

        String name();
        Device device() default Device.Router;
        Class human() default Human.class;
        Human extraInfo() default @Human;
        String[] sites() default {"S","K"};
    }

    enum Device{
        Router,
        Switch

    }
    //////////////////////////////////
@Repeatable(Batteries.class)
    @interface Battery {
        String level();
        boolean recharge();
    }


    @interface Batteries{
        Battery[] value();
    }
    @Battery(level="High",recharge = false)
    @Battery(level="low",recharge = false)
    public class AnnotationTest {

}
