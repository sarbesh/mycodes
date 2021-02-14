package com.codechef.beginner;

import java.util.*;
import java.lang.*;
import java.io.*;

public class TSORT {

    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        FastReader in  = new FastReader();
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        // Read the number of test casese.
        int T = in.nextInt();
        int[] N = new int[T];
        while (T-- > 0) {
            // Read the numbers a and b.
            N[T] = in.nextInt();
        }
//        output.write(Arrays.toString(N));
//        quickSort(N,0,N.length-1);
//        System.out.println(Arrays.toString(N));
//        output.write(Arrays.toString(N));
        Arrays.stream(N).sorted().forEach(System.out::println);
        output.flush();
    }

    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static int partition(int[] arr, int low, int high){
        int pivotal = arr[high];
        int i = low-1;
        for (int j=low;j<high ;j++ ){
            if(arr[j]<=pivotal){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
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
