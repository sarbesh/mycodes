import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;



// Remember that the class name should be "Main" and should be "public".
public class KAVGMAT {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			long n = in.nextLong();
			long m = in.nextLong();
			long k = in.nextLong();
			double[][] arr = new double[(int)n+1][(int)m+1];
			for(int i=0;i<=n;i++){
				for (int j=0;j<=m ;j++ ) {
					if(i==0||j==0) arr[i][j]=0;
					else arr[i][j] = in.nextDouble();
				}
			}
			for(long i=0;i<=n;i++) {
				double prev =0 ;
				for(long j=0;j<=m;j++) {
					arr[(int)i][(int)j]+=prev;
					prev=arr[(int)i][(int)j];
				}
			}
			for(long i=0;i<=m;i++) {
				double prev =0 ;
				for(long j=0;j<=n;j++) {
					arr[(int)j][(int)i]+=prev;
					prev=arr[(int)j][(int)i];
				}
			}
			long min = n<m?n:m;
			long ans = 0;
			for(long a=1;a<=min;a++) {
				for(long i=a;i<=n;i++) {
					for(long j=a;j<=m;j++){
						if((arr[(int)i][(int)j]+arr[(int)i-(int)a][(int)j-(int)a]-arr[(int)i][(int)j-(int)a]-arr[(int)i-(int)a][(int)j])/(a*a)>=k){
							ans++;
						}
					}
				}
			}
			out.write(ans+"\n");

		}
		out.flush();
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