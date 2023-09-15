package com.divya.DSA.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] x= {1,2,4,23,7,8,9,10};
       int n= x.length;
        System.out.println(Arrays.toString(x));
        sort(x,0,n-1);

        //int[] y=merge(x,0,3,7);
        System.out.println(Arrays.toString(x));
    }

    public static void sort(int[] A, int s, int e){
            if(s>=e){
                return ;
            }
            int mid= (s+e)/2;
            sort(A,s,mid);
            sort(A,mid+1,s);
            merge(A,s,mid,e);
    }
    public static int[] merge(int[] A,int s,int mid,int e ){
        int ans[] = new int[(e-s)+1];
            int i=s;
            int j=mid+1;

            for(int k=s; k<=e;k++){
                if(j<=e && i>mid){
                    ans[k]=A[j];
                    j++;
                }
                else if (i<=mid&& j>e){
                    ans[k]=A[i];
                    i++;
                }
                else{
                    if(A[i]<A[j]){
                        ans[k]= A[i];
                        i++;
                    }
                    else{
                        ans[k]=A[j];
                        j++;
                    }
                }
            }
            return ans;
    }
}
