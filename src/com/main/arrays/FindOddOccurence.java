package com.main.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class FindOddOccurence {

    static int usingXOR(int[] array){
        int XOR = 0;
        for(int i: array){
            XOR ^= i;
        }
        return XOR;
    }

    static int usingHashing(int[] array){
        HashMap<Integer,Integer> weights = new HashMap<>();
        int count=0;
        for(int i=0; i<array.length;i++){
            if(weights.containsKey(array[i])){
                 count = weights.get(array[i]);
                 weights.put(array[i], count+1);
            }
            else {
                weights.put(array[i],1);
            }
        }

        for(int i: weights.keySet()){
            if(weights.get(i)%2!=0){
                return i;
            }
        }
        return -1;
    }
    public static int maximizingXor(int l, int r) {
    // Write your code here
    List<Integer> results = new ArrayList<>();
        for(int i=l; i<=r; i++){
            for(int j=r; j>l; j--){
                System.out.println(Integer.toString(i) + "*" + Integer.toString(j));
                results.add(i^j);
            }
        }
        return Collections.max(results);

    }

    public static int greatestXOR(int length){
         HashMap<Integer, Integer> results = new HashMap<>();
         int count=0;
        for(int i=1; i<length+1; i++){
            results.put(i,0);
        }
        for(int i: results.keySet()){
           count=simplegreatestXOR(i);
           results.put(i, count);
           count=0;
        }
        System.out.println(results.toString());
        return -1;
    }

    static int simplegreatestXOR(int x){
        int count=0;
        for(int i=1; i<x;i++){
            if((i^x)>x){
                count++;
            }
        }
        return count;
    }

public static void main(String[] args) {
    int[] inputArray = {2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
   //greatestXOR(100);
   System.out.println(5<<3);
   //System.out.println(Math.log(13)/Math.log(2));
   System.out.println(Math.floor(Math.log(13)/Math.log(2)));
   System.out.println(Math.pow(2,3));
}
}
