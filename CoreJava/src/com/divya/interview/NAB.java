package com.divya.interview;

import java.util.*;

public class NAB {
// write a function Given an array of string you have to find 2 string which has common letter at common position
    //like ["klm","abc",
//                 "dbe"]
    //ans will be an array[1,2,0]
    public static void main(String[] args) {
        String[] ar= new String[]{"klm","abc","dbe"};
        System.out.println(Arrays.toString(getCommon(ar)));
    }

    public static int[] getCommon(String[] ar){
        int n=ar.length;
        int m= ar[0].length();
        char[][] ch= new char[n][m];
        int[] result= new int[3];
        for(int i=0;i<n;i++){
            String s= ar[i];
            for(int j=0;j<m;j++){
                ch[i][j]=s.charAt(j);
            }
            Map<Character,Integer> map=new HashMap<>();
        for(int q=0;q<m;q++){

            for(int k=0;k<n;k++){
               char c= ch[k][q];
               if(map.containsKey(c)){
                   result[0]=k;
                   result[1]=map.get(c);
                   result[2]=q;
                    return result;
               }
               else{
                   map.put(c,k);
               }
            }
            map.clear();
        }
        }
        return new int[]{};
    }
}
