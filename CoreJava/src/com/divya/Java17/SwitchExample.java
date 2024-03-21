package com.divya.Java17;

public class SwitchExample {

    public static void main(String args[]) {
        int tax=1;
        int price=new SwitchExample().getPrice(tax);
        /*Days day=Days.SATURDAY;
        int num=new SwitchExample().getNumLetters(day);
        System.out.println("price: "+num);
*/
        System.out.println("price: "+price);

    }

    public int getPrice(int tax){
        int price=3;
        switch(tax){
            case 1:price=4;

            case 5:return price=4;

            default:return 2*tax;
        }

    }
    public int getNumLetters(Days day){
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> {
                System.out.println(6);
                yield 6;
            }
            case TUESDAY -> {
                System.out.println(7);
                yield 7;
            }
            case THURSDAY, SATURDAY -> {
                System.out.println(8);
                yield 8;
            }
            case WEDNESDAY -> {
                System.out.println(9);
                yield 9;
            }
            default -> {
                throw new IllegalStateException("Invalid day: " + day);
            }
        };
        return numLetters;
    }

}
