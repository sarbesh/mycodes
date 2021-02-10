package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class INTEST {
    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        FastReader s = new FastReader();
        long n = s.nextLong();
        long k = s.nextLong();
        long ans = 0;
        while(n>0){
            long val = s.nextLong();
            if(val%k==0){
                ans++;
            }
            n--;
        }
        System.out.println(ans);

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
