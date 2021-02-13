package com.sarbesh.algo;

import java.util.*;
import java.lang.*;
import java.io.*;

//url:- https://www.baeldung.com/java-generate-prime-numbers#4-using-sieve-of-eratosthenes

public class GeneratePrime {

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = in.nextInt();
        List<Integer> primes = sieveOfEratosthenes(n);
        out.write(primes.size()+"\n");
        out.flush();

    }

    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);//[t,t,t,t,t,t,t,t,t,.........]
        for (int p = 2; p * p <= n; p++) {//run the loop till sqrt of MAX
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {//mark false for increments by i as they are divisible by i
                    prime[i] = false;
                }
            }
        }
        //Index of every prime will be true and non-prime will be false
//primes = [t,t,t,t,f,t,f,t,f,f,f,t,f,t,f,f,,,,,,]
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
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
