package com.divya.DSA;

public class BitDemo {

    public static void main(String[] args) {
        int[] arr= {11,10,13,10,13,1,5,5,11};        for(int i=0;i<arr.length;i++){
            System.out.print(isBitSet(arr[i],2)+", ");
        }

        int x=10;
        int y= 1<<x;
        System.out.println("2^10="+y);

        System.out.println("ans:"+getUnique(arr));

    }

    public static int getUnique(int[] ar){
        int ans=0;
        int n=ar.length;
        for(int i=0; i<n; i++){
            System.out.print(ans+"^"+ar[i]+"=");
            ans=ans^ar[i];
            System.out.println(ans);
        }
        return ans;
    }

    public static boolean isBitSet(int n, int k){
        if((1<<k & n) ==0){
            return false;
        }
        return true;
    }
}
