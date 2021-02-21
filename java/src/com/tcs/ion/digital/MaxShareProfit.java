package com.tcs.ion;

import java.util.*;
import java.lang.*;
import java.io.*;

//Ther is an stock of a company of 7 days.
//        12,23,15,27,30,10,13
//
//        One has to buy the stock and sell the stock to get the maximum profit.
//
//        Example for above array.
//        Buy on day 1 sell on day 2.
//        Then buy on day 3 sell on day 5.
//        Then buy on day 6 sell on day 7.
//        Calculate the total profit and return.
//        Profit hast to be maximum.
//
//        Input . The array.
//        Output. The maximum profit.

public class MaxShareProfit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int profit = 0;
        int i =0;
        int buy=0;
        int sell=0;
        while(i<input.length){
            if (buy==0){
                if (Integer.parseInt(input[i])>Integer.parseInt(input[i+1])){
                    i++;
                }
                if (Integer.parseInt(input[i])<Integer.parseInt(input[i+1])){
                    buy=Integer.parseInt(input[i]);
                    i++;
                }
            }
            if (sell==0){
                if (Integer.parseInt(input[i])>Integer.parseInt(input[i+1])){
                    i++;
                }
                if (Integer.parseInt(input[i])<Integer.parseInt(input[i+1])){
                    i++;
                }
            }
        }
    }
}
