package com.main.math;

public class Problems {

    public static int findGCD(int a, int b){
        if(a==0 || b==0){
            return Math.max(a, b);
        }
        if(a<b){
            a=a+b; // a=3, b=1 ==> a=4, b=1
            b=a-b; // a=4 , b=1 ==> a=4, b=3
            a=a-b; // a=4, b=3 ==> a=1, b=3
        }
        if(a%b==0){
            return b;
        }
    return findGCD(b,a%b);
    }
}
