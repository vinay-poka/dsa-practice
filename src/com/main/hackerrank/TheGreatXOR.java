package com.main.hackerrank;

import java.util.HashMap;

//challange link
// https://www.hackerrank.com/contests/assignment-july-batch-25/challenges/the-great-xor

/*
 * Followed the Bruteforce method but this got failed when the input is large
 * Followed one article: https://codecurse.medium.com/the-great-xor-hackerrank-problem-c47efe237398
 * where we observed some pattern when input is changed
 */

public class TheGreatXOR {
//most optimum solution
public static long theGreatXor(long x) {
    // Write your code here
        double group;
        group = Math.floor(Math.log(x)/Math.log(2));
        return Math.round((Math.pow(2,group+1)-1)) - x;
    }

// to observe patterns follow the below code
   public static int greatXOR(int length){
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
}
