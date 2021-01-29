package com.tcs.ion;

import java.util.Arrays;
import java.util.Scanner;

public class exp1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("# test cases");
        int n = sc.nextInt();
        while(n>0) {
            System.out.println("Enter sentence: ");
            String sent = sc.nextLine();
            System.out.println(sent);
            String[] sentA = sent.split(" ");
            int l = sentA.length;
            System.out.println(l);
            while(l>=0) {
                System.out.println(checkVolv(sentA[l-1].split("")));;
                l--;
            }
            n--;
        }
    }

    private static int checkVolv(String[] stringArr) {
        String[] volv = {"a","e","i","o","u"};
        int n = 0;
        int len = stringArr.length;
        while(len>=0) {
            if (Arrays.asList(volv).contains(stringArr[len-1])) {
                n=n+1;
                len--;
            }
        }
        return n;
        // TODO Auto-generated method stub

    }

}
