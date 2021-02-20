package com.tcs.ion;

//Multiply the values provided in a space separated line.

import java.util.*;

public class Multi {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String N = "123456789";
        method1(N);
        method2(N);
    }

    static void method1(String inp){
    	final long startTime = System.nanoTime();
    	String[] numS = inp.split("");
        int res = 1;
        for (int i = numS.length-1; i >= 0; i--) {
            res = res * Integer.parseInt(numS[i]);
        }
        System.out.println(res);
        final long endTime = System.nanoTime();
        System.out.println("Method1 Total execution time: " + (endTime - startTime));
    }

    static void method2(String inp){
    	final long startTime = System.nanoTime();
    	int num = Integer.parseInt(inp);
    	int res=1;
    	while(num!=0){
    		res=res*(num%10);
    		num=num/10;
    	}
        System.out.println(res);
        final long endTime = System.nanoTime();
        System.out.println("Method2 Total execution time: " + (endTime - startTime));
    }
}
