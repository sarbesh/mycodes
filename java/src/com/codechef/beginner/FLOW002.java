package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FLOW002 {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        FastReader sc = new FastReader();
        int T = sc.nextInt();
        while(T-- > 0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(B==0){
                System.out.println(A);
            } else {
                System.out.println(A%B);
            }
        }
    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while(st==null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch(IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
