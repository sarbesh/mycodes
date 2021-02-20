package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;


// Remember that the class name should be "FLOW004" and should be "public".
public class FLOW004 {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        FastReader in  = new FastReader();
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        // Read the number of test casese.
        int T = in.nextInt();
        while (T-- > 0) {
            // Read the numbers a and b.
            String a = in.nextLine();

            // Compute the sum of a and b.
            int ans = Integer.parseInt(a.substring(0,1)) + (Integer.parseInt(a)%10);
            output.write(ans+"\n");
        }
        output.flush();
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