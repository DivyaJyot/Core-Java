package com.divya.DSA.Problems;

public class AlphaNumericRearrangement {
    //Place all numeric characters in string before alphabet characters .
    public static void main(String[] args) {
        String out =reArrange("1abc123ahn785");
        System.out.println(out);
    }
    //Using min swaps and O(1) space and Maintain the order of characters.
    /*private static String reArrangeWithO1Space(String s) {
        int n= s.length();
        int k=0;
        int j=0;
       while(s.charAt(k)<65){
           k++;
       }
       // k having first char
       for(int i=k;i<n;i++){

       }


    }*/
    private static String reArrange(String s) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        int n= s.length();
        for(int i=0; i<n;i++){
            char c= s.charAt(i);
            if(c<65){
                s1.append(c);
            }
            else{
                s2.append(c);
            }
        }

        return s1.toString()+s2.toString();
    }
}
