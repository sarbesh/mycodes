import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;



// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			int N = in.nextInt();
			int M = in.nextInt();
			int[] A = new int[N];
			int[] L = new int[N];
			int[] R = new int[N];
			int[] ans = new int[N];
			int[] B = new int[M];

			for (int i =0;i<N ;i++ ) {
				A[i] = in.nextInt();

				if (A[i]==1) {
					L[i]=0;
				} else {
					L[i] = -3;
				}

				if (A[i]==2) {
					R[i]=0;
				} else {
					R[i] = -3;
				}

				if(A[i]!=0){
					ans[i] = 0;
				} else {
					ans[i] = -3;
				}
			}

			for (int i=0;i<M ;i++ ) {
				B[i] = in.nextInt();
			}

			L[0] = 0;
			R[0] = 0;

			if(A[N-1]==0){
				R[N-1]=-1;
			} else {
				if (A[N-1]!=1) {
					R[N-1]=0;
				} else {
					R[N-1]=-1;
				}
			}

			for (int i=1;i<N ;i++ ) {
				if (L[i]==-3) {
					if (i!=1) {
						if (L[i-1]==-1) {
							L[i]=-1;
						} else{
							L[i]=L[i-1]+1;
						}
					} else{
						if (A[0]==1) {
							L[i]=1;
						} else{
							L[i]=-1;
						}
					}
				}
				if (R[N-1-i]==-3) {
					if(R[N-1-i+1]==-1){
						R[N-1-i]=-1;
					} else {
						R[N-1-i] = R[N-1-i+1]+1;
					}
				}
			}

			for (int i =0;i<N ;i++ ) {
				if (A[i]==2) {
					L[i]=0;
				}
				if (A[i]==1) {
					R[i]=0;
				}
			}

			for (int i=0;i<N ;i++ ) {
				if(ans[i]==-3){
					if (L[i]==-1 && R[i]==-1) {
						ans[i] = -1;
					} else if (L[i]!=-1 && R[i]==-1) {
						ans[i] = L[i];
					} else if (L[i]==-1 && R[i]!=-1) {
						ans[i] = R[i];
					} else {
						ans[i] = min(L[i],R[i]);
					}
				}
			}

			for(int i=0; i<M; i++){
				out.write(ans[B[i]-1]+" ");
			}

			out.write("\n");
		}
		out.flush();
	}

	static int min(int x, int y){
		if (x<y){
			return x;
		} else {
			return y;
		}
	}
	
	static class FastReader{
	    BufferedReader br;
	    StringTokenizer st;
	    
	    public FastReader(){
	        br = new BufferedReader(new InputStreamReader(System.in));
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
	    
	    String next(){
	        while (st==null || !st.hasMoreElements()){
	            st = new StringTokenizer(nextLine());
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
	    
	    float nextFloat(){
	        return Float.parseFloat(next());
	    }
	    
	    
	}

	
}