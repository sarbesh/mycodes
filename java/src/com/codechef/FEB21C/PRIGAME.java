package com.codechef.FEB21C;

import java.util.*;
import java.lang.*;
import java.io.*;

public class PRIGAME {

    public static void main(String[] args) throws Exception {
        FastReader fs = new FastReader();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] counts = sieveOfEratosthenesPrimesCount();
        int T = fs.nextInt();
        while (T-- > 0){
            String[] input = fs.nextLine().split(" ");
            if (counts[Integer.parseInt(input[0])]>Integer.parseInt(input[1])){
                out.write("Divyam\n");
            } else out.write("Chef\n");
        }
        out.flush();
    }

    static int[] sieveOfEratosthenesPrimesCount() {
        int MAX = 1000000;
        int[] prePrimes = new int[MAX+1];
        boolean[] prime = new boolean[MAX + 1];
        Arrays.fill(prime, true); //[t,t,t,t,t,t,t,t,t,.........]
        for (int p = 2; p * p <= MAX; p++) { //run the loop till sqrt of MAX
            if (prime[p]) {
                for (int i = p * 2; i <= MAX; i += p) { //mark false for increments by i as they are divisible by i
                    prime[i] = false;
                }
            }
        }
        //Index of every prime will be true and non-prime will be false
//primes = [t,t,t,t,f,t,f,t,f,f,f,t,f,t,f,f,,,,,,]
        prePrimes[0]=prePrimes[0]=0;
        for (int i =2; i<=MAX;i++){
            prePrimes[i]=prePrimes[i-1];
            if (prime[i]) prePrimes[i]++;
        }
//prePrimes = [0,0,1,2,2,3,3,4,4,4,4,5,5,6,6,6,6,7,7,......]
        return prePrimes;
    }

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next(){
            while (st==null || !st.hasMoreElements()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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

        int nextInt(){
            return Integer.parseInt(next());
        }
    }
}
