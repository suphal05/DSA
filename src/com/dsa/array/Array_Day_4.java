package com.dsa.array;

import java.util.Arrays;

public class Array_Day_4 {
    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int profitMax=0;
        for(int i=0;i<prices.length;i++){
            profitMax = Math.max(prices[i]-min,profitMax);
            min=Math.min(prices[i],min);
        }
        return profitMax;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};

        System.out.println(maxProfit(arr));
    }
}
