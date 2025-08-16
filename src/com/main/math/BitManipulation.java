package com.main.math;

public class BitManipulation {
    public static int getIthBit(int i, int num){
        if((num & (1 << i))==0){
            return 0;
        }
        return 1;
    }
    public static int setIthBit(int i, int num){
        return (num | (1<<i));
    }

    public static int clearIthBit(int i, int num){
        return (num & ~(1<<i));
    }

    public static boolean isPowerOfTwo(int num){
        boolean isPowerOfTwo = false;
        if((num & num-1) == 0){
            isPowerOfTwo = true;
            return isPowerOfTwo;
        }
        return isPowerOfTwo;
    }

}
