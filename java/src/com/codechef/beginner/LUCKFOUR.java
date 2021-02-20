package com.codechef.beginner;


import java.util.*;
import java.lang.*;
import java.io.*;


public class LUCKFOUR {

    public static void main(String[] args) throws Exception {
        FastReader in  = new FastReader();
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        // Read the number of test casese.
        int T = in.nextInt();
        while (T-- > 0) {
            // Read the numbers a and b.
            char[] a = in.nextLine().trim().toCharArray();
            long ans=0;
            for(char b :a) if(b=='4') ans++;
//            long ans = a.chars().filter(ch -> ch=='4').count();
//            long ans2 = a.length()-a.replaceAll("4","").length();
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
