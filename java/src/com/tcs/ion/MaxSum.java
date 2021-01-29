package com.tcs.ion;

//FFor every decrease in value to its predecessor given by space separated inputs create a new sum.
//Find the max of these sum

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
