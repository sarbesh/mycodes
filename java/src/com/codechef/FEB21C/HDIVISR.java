package com.codechef.FEB21C;

import java.util.*;

public class HDIVISR {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        for(int i =10; i>=1;i--){
            if(N%i==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
