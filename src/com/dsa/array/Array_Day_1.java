package com.dsa.array;

import java.util.Arrays;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Array_Day_1 {
    public static int removeDuplicates(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[x]) {
                x = x + 1;
                nums[x] = nums[i];
            }
        }
        return x + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
}
