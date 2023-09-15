package com.divya.DSA.sorting;

import java.util.Arrays;

public class StreamSorting {

    public static void main(String[] args) {
        int[] in= {1,7,8,4,3};
        int n= in.length;
        int[] ans= new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                ans[0]=in[i];
            }
            else
                sort(ans,in[i],i);
        }
        System.out.println("ans is"+ Arrays.toString(ans));
    }
    public static void sort(int[] A, int x, int n){
        int i;
        for( i=n; i>=1;i--){//  3
            if(x<=A[i-1]){
                A[i]=A[i-1];
            }
            else{
                A[i]=x;
                break;
            }
        }
        A[i]=x;
    }
}
