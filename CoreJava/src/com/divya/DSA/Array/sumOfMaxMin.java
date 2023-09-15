package com.divya.DSA.Array;

import java.util.Arrays;

public class sumOfMaxMin {
    //find the sum of max-min of all subsets of an array
    //3,5,6
    //{3},{5},{6},{3,5},{3,6}{5,6},{3,5,6}//2+3+3+1+3
    public static void main(String[] args) {
        int[] ar= {3,5,6};
        int ans=getSumMinMax(ar);
        System.out.println(ans);
    }

    public static int getSumMinMax(int[] A){
        int sum=0;
        int n =A.length;//3
        //3,5- 3,6, 3,5,6
        //5- 5,6
        //1- 5*2^5 times   max-0
        //5- 3*6+5*1- (3*3+5*1)
        //contribution techniqu2
        Arrays.sort(A);
        for(int i=0;i<n;i++){
            System.out.println("added"+i+"--"+(2^i));
            sum=sum+(A[i]*(1<<i));//
            System.out.println();
            sum=sum-(A[i]*2^(1<<(n-i-1)));

        }
        return sum;
    }
}
