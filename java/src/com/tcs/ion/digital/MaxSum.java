package com.tcs.ion;

//Determine from this space saperated array what will be the maximum profit one can make.
//        rules- the money has to be in increasing order like 2,3,200 the the profit is 205
//
//        Array - 2 30 600 5 4 200 1 6
//
//        Return the maximum profit one can make.
//
//        Input - 1.no element in an array
//        2.The array.

import java.util.*;

public class MaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int maxSum = 0;
        int sum = Integer.parseInt(inputs[0]);
        for (int i = 1; i < inputs.length; i++) {
            if (Integer.parseInt(inputs[i])<Integer.parseInt(inputs[i-1])){
                if (maxSum < sum){
                    maxSum = sum;
                }
                sum=0;
            }
            sum = sum+Integer.parseInt(inputs[i]);
        }
        System.out.println(maxSum);
    }
}
