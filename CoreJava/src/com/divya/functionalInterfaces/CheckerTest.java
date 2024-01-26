package com.divya.functionalInterfaces;



public class CheckerTest {
    public static void main(String[] args) {
        String t= "Divya";
        PasswordChecker checker= (s)->s.length()>1;
        PasswordChecker checker2= s->s.startsWith("#");
        PasswordChecker checker3= String::isBlank;
        //PasswordChecker checker4= t::isEmpty;
        PasswordChecker checker5= s->s.startsWith("#");
        PasswordChecker checker6= String::isBlank;
        System.out.println(checker.checkPassword("Divya"));
        System.out.println(checker2.checkPassword("Divya"));
        System.out.println(checker3.checkPassword("Divya"));
        getMax(new int[]{12,2,5,7});


    }

    public static int[] getMax(int[] a){
        int n=a.length;
        int[] res= new int[2];
        for (int i=0;i<n;i++){
            Integer x=a[i];
           String bin1= Integer.toBinaryString(x);
           System.out.println(bin1);
           System.out.println();
           System.out.println();
        }
        return res;
    }
}
