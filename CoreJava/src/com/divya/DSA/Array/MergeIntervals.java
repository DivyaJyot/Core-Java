package com.divya.DSA.Array;

import java.io.IOException;

public class MergeIntervals {
    // Create a sorted non-overlapping interval
    public static void main(String[] args) {
        int[] s= {1,5,10};
        int[] e={3,8,12};
        int x= 9;
        int y=10;
        try {
            System.out.println("calling python");
            Process processs = Runtime.getRuntime().exec("python C:\\Users\\Divya\\Downloads\\script.py");

            System.out.println("called python"+processs.getOutputStream().toString());
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        //C:\EclipseWorkspaces\Hiberanate\HiberDemo2\src\script.py
        mergeInterval(s,e,x,y);
    }

public static void mergeInterval(int[] s, int[] e, int x, int y){
        int n= s.length;
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            int l=s[i];
            int r=e[i];
            if(x<=e[i] && y>=s[i]){
                if(first==-1)
                        first=i;
                last=i;
                l= Math.min(l,x);
                r=Math.max(r,y);
            }
            System.out.println(l+"---"+r);

        }
}
}
