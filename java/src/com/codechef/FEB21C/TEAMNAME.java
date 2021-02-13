package com.codechef.FEB21C;

import java.nio.Buffer;
import java.util.*;
import java.lang.*;
import java.io.*;


// Remember that the class name should be "Main" and should be "public".
public class TEAMNAME {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        FastReader in  = new FastReader();
        // Read the number of test casese.		
        int T = in.nextInt();
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        while (T-- > 0) {
            int N = in.nextInt();
            String[] names = in.nextLine().split(" ");
            int ans = maxTeamName(names, N);
            output.write(ans+"\n");
        }
        output.flush();
    }

    static int maxTeamName(String[] names,int N){
        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
        String A,B,a,b;
        int count = 0;
        for (int i=0;i<N;i++){
            for (int j =i+1;j<N;j++){
                A = names[i];
                B = names[j];

                a=A.substring(0,1);
                b=B.substring(0,1);

                A = A.replaceFirst(a,b);
                B = B.replaceFirst(b,a);


                System.out.println();

                if(a.equals(b)){
//                    System.out.println(a[0]+", "+b[0]);
                }
                else if(A.equals(B)){
//                    System.out.println(A+", "+B);
                }
                else if ((Arrays.binarySearch(names,A)<0) && (Arrays.binarySearch(names,B)<0)){
//                    System.out.println(A+", "+B);
                    count+=2;
                }
            }
        }
        return count;
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