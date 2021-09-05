import java.io.*;
import java.util.*;
import java.math.*;

public class netcore1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            long K = Long.parseLong(br.readLine().trim());

            int out_ = solve(N, A, K);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int solve(int N, int[] A, long K){
        // Write your code here
        int result = 0;
        int[] resArr = new int[((N*(N-1))/2)+1];
        int m=0;
        resArr[m]=0;
        for(int i=0;i<=N-2;i++){
            for(int j=i+1;j<=N-1;j++){
                resArr[++m]=Math.abs(A[i]-A[j]);
            }
        }
        Arrays.sort(resArr);
        if(K<=N){
            result = resArr[0];
        } else {
            int j=0;
            for(int i=N+2;i<=K;i=i+2){
                j++;
            }
            result = resArr[j];
        }

        return result;

    }
}