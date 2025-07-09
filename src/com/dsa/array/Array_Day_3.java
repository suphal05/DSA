package com.dsa.array;

import java.util.Arrays;

public class Array_Day_3 {
    public static void reverseString(char[] s) {
        int length = s.length;
        for(int i=0;i< length/2;i++){
            char temp = s[i];
            s[i] = s[length-1-i];
            s[length-1-i]= temp;
        }
    }
    public static void main(String[] args) {
        char[] arr = {'a','n','s','u','m','a','n'};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}
