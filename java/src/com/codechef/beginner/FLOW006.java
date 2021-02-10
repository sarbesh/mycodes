package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FLOW006 {
    public static void main(String[] args) {
        FastReader in = new FastReader();
        int n = in.nextInt();
        int sum=0;
        while (n!=0){
            sum =sum+n%10;
            n = n/10;
        }
        System.out.println(sum);
    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
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
            String str = "";
            try{
                str = br.readLine();
            } catch(IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }
}
