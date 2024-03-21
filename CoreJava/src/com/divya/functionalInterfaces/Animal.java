package com.divya.functionalInterfaces;

  interface Animal {
    int limbs=4;
    void eat();
     void run();

     class Mammal implements Animal{
         public void eat(){
             System.out.println("eat all");
         }
         public void run(){
             System.out.println("run or walk or scroll");
         }

         public static void main(String args[]){
             Mammal mammal= new Mammal();
             mammal.eat();
             mammal.run();
         }
     }
}

