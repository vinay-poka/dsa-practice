package com.main.math;

public class BinarySearch {
    static int linearSearch(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target){
        //[1,2,4,8,9,10]
        int left=0,right=arr.length-1;
        int mid;
        while(left<=right){
            mid = (left+right)/2;
            System.out.println("While Loop"+"left="+left+"right="+right+"mid="+mid);
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else right = mid-1;
        }


       return -1;
    }
}
