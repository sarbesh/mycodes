package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FSQRT {
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = in.nextInt();
        while (T-->0){
            int N = in.nextInt();
            int ans = (int) Math.sqrt(N);
            out.write(ans+"\n");
        }
//        out.write("\n");
        out.flush();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }

}
