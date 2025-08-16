package com.main.hackerrank;
//Challange Link
//https://www.hackerrank.com/contests/assignment-july-batch-25/challenges/flipping-bits
public class FlippingBits {
 public static long flippingBits(long n) {
     return n^(Integer.toUnsignedLong(-1));

    }

}
