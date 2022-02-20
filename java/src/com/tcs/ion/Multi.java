package com.tcs.ion;

//Multiply the values provided in a space separated line.

import java.util.*;

public class Multi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numS = sc.nextLine().split(" ");
        int res = 1;
        for (int i = numS.length-1; i >= 0; i--) {
            res = res * Integer.parseInt(numS[i]);
        }
        System.out.println(res);
    }
}
