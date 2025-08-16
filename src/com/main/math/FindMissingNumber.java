package com.main.math;

import java.util.List;

public class FindMissingNumber {
//skipping bruteforce with time complexity O(N^2)
    static int missingNumberWithSum(int[] arr){
        int sumOfArray = 0;
        for(int i:arr){
            sumOfArray+= i;
        }
        int n=arr.length+1;
        int sumOfNElements = (n*(n+1))/2;
        System.out.println("sumOfNElements"+sumOfNElements+". "+"sumOfArray"+sumOfArray);
        if(sumOfNElements-sumOfArray>0){
            return sumOfNElements-sumOfArray;
        }
        return -1;
    }

    static int missingNumberWithXOR(int[] array){
        int n = array.length+1;
        int xor = 0;
        for(int i=0;i<=n;i++){
            xor^=i;
        }
        //System.out.println("xor="+xor);
        for (int j:array){
            xor^=j;
        }
        //System.out.println("xor="+xor);

        return xor;
    }

    public static int lonelyinteger(int[] a) {
        int lonelyInteger = 0;
        
        for(int i:a){
            lonelyInteger ^= i;
        }
        return lonelyInteger;
    }

public static void main(String[] args){
    int[] array = {1,2,3,4,3,2,1,4,8};
    System.out.println(lonelyinteger(array));
}
}
