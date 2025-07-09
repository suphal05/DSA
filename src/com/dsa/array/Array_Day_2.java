package com.dsa.array;

import java.util.Arrays;

public class Array_Day_2 {
    public static int removeElement(int[] nums, int val) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[x]=nums[i];
                x++;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,2));
        System.out.println(Arrays.toString(arr));
    }
}
