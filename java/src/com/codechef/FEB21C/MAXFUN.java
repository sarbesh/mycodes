package com.codechef.FEB21C;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MAXFUN {


    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        FastReader in  = new FastReader();
        // Read the number of test casese.
        int T = in.nextInt();
        while (T-- > 0) {
            int N = in.nextInt();
            String[] input = in.nextLine().split(" ");
            System.out.println(Arrays.toString(input));
            int ans =0;
            int[] a =  new int[N];
//            for(int i =0; i<N;i++){
//                a[i] = Integer.parseInt(input[i]);
//            }
            a = Arrays.stream(input).mapToInt(Integer::parseInt).sorted().toArray();
//            quicksort(a,0,N-1);
            System.out.println(Arrays.toString(a));
            if(N%2==0){
                int m1 = N/2;
                int m2 = (N-2)/2;
                int sum1 = mod(a[N-1],a[m1])+mod(a[m1],a[0])+mod(a[0],a[N-1]);
                int sum2 = mod(a[N-1],a[m2])+mod(a[m2],a[0])+mod(a[0],a[N-1]);
                ans = (Math.max(sum1, sum2));
            } else {
                int m = (N-1)/2;
                ans = mod(a[N-1],a[m])+mod(a[m],a[0])+mod(a[0],a[N-1]);
            }
            System.out.println(ans);
        }
    }

    static int mod(int a, int b){
        if(a<b)return b-a;
        return a-b;
    }

    static void quicksort(int[] arr, int low, int high){
        if (low>=high) return;
        int pivotPosition = partition(arr, low, high);
        quicksort(arr,low, pivotPosition-1);
        quicksort(arr, pivotPosition+1, high);
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
//        int pivotal = (arr[low]);
//        int left = low, right = high-1;
//        while (left < right){
//            while((arr[left])<=pivotal){
//                left++;
//            }
//            while(arr[right]>pivotal){
//                right--;
//            }
//            if(left>=right){
//                break;
//            }
//            swap(arr,left,right);
//        }
//        swap(arr,low,right);
//        return right;
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
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
