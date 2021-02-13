package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;

//Q:- https://www.codechef.com/submit/HS08TEST

public class HS08TEST {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        double withdraw = Double.parseDouble(input[0]);
        double balance = Double.parseDouble(input[1]);
        double charge = 0.50;
        if(withdraw%5==0 && withdraw<=(balance-charge)){
            balance = balance - withdraw - charge;
        }
        System.out.printf("%.2f %n",balance);
        sc.close();
    }
}
