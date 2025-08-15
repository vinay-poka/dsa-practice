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
        System.out.println("a="+a + "b="+b);
        if(a%b==0){
            return b;
        }
    return findGCD(b,a%b);
    }

    public static int findGCDmoreThanTwoNumbers(int[] inputArray){
        int result = inputArray[0];
        int arrayLength = inputArray.length;
        for(int i=0;i<arrayLength;i++){
            System.out.println("result:"+result);
            result = findGCD(result,inputArray[i]);
        }

        return result;
    }
    public static String findDecimalNumber(int n){
        String binaryDigit = "";
        int remainder = 0;
        while(n>0){
            remainder = n%2;
            binaryDigit = binaryDigit+remainder;
            n=n/2;
        }
        StringBuilder str = new StringBuilder(binaryDigit);
        return str.reverse().toString();
    }

    public static int[] findPrimeNumbers(int n){
        int[] primerNumbers = new int[n+1];
        boolean[] isPrime = new boolean[n+1];
        for(int i=0;i<=n;i++){
            isPrime[i] = true;
        }

        for(int i=2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j=i;j*i<n;j++){
                    isPrime[i*j]=false;
                }
            }
        }
        for(int i=2;i<isPrime.length-1;i++){
            if(isPrime[i]){
                primerNumbers[i] = i;
                System.out.println(primerNumbers[i]);
            }
        }
        return primerNumbers;
    }
}
