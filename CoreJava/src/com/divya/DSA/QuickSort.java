package com.divya.DSA;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] ar= {1,9,23,3,7,1,9,4,90,100,200,11,9};
        quickSort(ar,0, ar.length-1);
        System.out.println(Arrays.toString(ar));

    }

    public static void quickSort(int[] A, int s, int e){
        System.out.println("s="+s+"e="+e);
        if(s>=e)
            return;
        int piv= partition(A,s,e);
        quickSort(A,s,piv-1);
        quickSort(A,piv+1,e);
    }

    public static int partition(int[] A,int s, int e){
        int n = e-s+1;
        int pv=A[e]; //3,7,1,9,4,90,5;
        int i=s;
        int j=s;
        while(i<=e){
            if(A[i]<pv){
                swap(A,i,j);
                j++;
            }
            i++;
        }
        swap(A,j,e);
        System.out.println("pivot is "+pv);
        return j;
    }

    public static void swap(int[] A, int a, int b){
        int temp=A[a];
        A[a]=A[b];
        A[b]=temp;
    }
}
