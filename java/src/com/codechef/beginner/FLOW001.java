package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;

//Q:- https://www.codechef.com/submit/FLOW001

public class FLOW001 {

    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        FastReader in  = new FastReader();
        // Read the number of test casese.
        int T = in.nextInt();
        while (T-- > 0) {
            // Read the numbers a and b.
            int a = in.nextInt();
            int b = in.nextInt();

            // Compute the sum of a and b.
            int ans = a + b;
            System.out.println(ans);
        }
    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while (st==null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }

        Double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str="";
            try {
                str = br.readLine();
            } catch(IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

}
