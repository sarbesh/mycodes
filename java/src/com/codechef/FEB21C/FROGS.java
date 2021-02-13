package com.codechef.FEB21C;

import java.util.*;
import java.lang.*;
import java.io.*;

//Q:- https://www.codechef.com/FEB21C/submit/FROGS

public class FROGS {

    public static void main(String[] args) {
        // System.in and System.out are input and output streams, respectively.
        FastReader in  = new FastReader();
        // Read the number of test cases.
        int T = in.nextInt();
        while (T-- > 0) {
            // Read the numbers a and b.
            int N = in.nextInt();
            String[] Weights = in.nextLine().split(" ");
            String[] Length = in.nextLine().split(" ");
            int[] w =new int[N];
            int[] l =new int[N];
//            int[] index = new int[N];
            int[] pos = new int[N];
            for (int i=0;i<N;i++){
                pos[i]=i+1;
                w[i]=Integer.parseInt(Weights[i]);
                l[i]=Integer.parseInt(Length[i]);
            }
            int ans=0;
//            System.out.println(Arrays.toString(w)+" "+ Arrays.toString(l)+" "+ Arrays.toString(pos));
            bubleSort(pos,w,l,N);
//            System.out.println(Arrays.toString(w)+" "+ Arrays.toString(l)+" "+ Arrays.toString(pos));
            for (int i =1; i<N; i++){
//                System.out.println("i="+i+"; pos[i]="+pos[i]+"; pos[i-1]="+pos[i-1]);
                while((pos[i]<=pos[i-1])){
                    pos[i] = pos[i] + l[i];
//                    System.out.println("inc: "+l[i]+"; new position: "+pos[i]);
                    ans++;
                }
            }
//            System.out.println(Arrays.toString(pos));
            System.out.println(ans);
        }
    }

    static void bubleSort(int[] pos, int[] W, int[]L, int N){
        boolean swapped ;
        for (int i =0; i<N-1; i++){
            swapped =false;
            for(int j=0; j<N-i-1; j++){
                if (W[j]>W[j+1]){
                    swap(W,j,j+1);
                    swap(pos,j,j+1);
                    swap(L,j,j+1);
                    swapped =true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    static void quicksort(int[] arr,int begin,int end){
        if(begin>=end) return;
        int pivotalPos = position(arr,begin,end);
        quicksort(arr,begin,pivotalPos-1);
        quicksort(arr,pivotalPos+1,end);
    }

    private static int position(int[] arr, int low, int high) {
        int pivotal = arr[high];
        int i = (low -1); //index of smaller element
        for (int j =low;j<high;j++){
            if (arr[j]<pivotal){
                i++;
                // swap arr[i] and arr[j]
                swap(arr,i,j);
            }
            swap(arr,i+1,high);
        }
        return 0;
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
