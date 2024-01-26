package com.divya.DSA.Bit;

public class UniqueEle {
    //find 2 unique elemnts in an array
    public static void main(String[] args) {
        int[] arr= {3,7,8,8,7,3,1,4,1,5,6,4};
        getUniques(arr);

    }

    public static void getUniques(int [] ar){
        int n= ar.length;
        int xor1=0;
        int xor2=0;
        for(int i=0;i<32;i++){
            for(int j=0;j<n;j++){
                int num= ar[i];
                if((num & (1<<i)) ==0){
                    xor1=xor1^num;

                }
                else{
                    xor2=xor2^num;
                }
            }
            if(xor1>0 && xor2>0){
                System.out.println(xor1+","+ xor2);
                break;
            }
        }
    }
}
