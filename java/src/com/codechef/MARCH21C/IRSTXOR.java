import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


// Remember that the class name should be "Main" and should be "public".
public class IRSTXOR {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		long[] intArr = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912,1073741824};
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int N = intArr.length;	
		int T = in.nextInt();
		while(T-->0){
			long C = in.nextLong();
			double D = 0;
			int d=1;
			while(C>=D){
				D=Math.pow(2,d);
				d++;
			}
			double j = Math.pow(2,d-2);
			double v = D-C;
			double ans = (j-1)*((j-1)+v);
			out.write((long)ans+"\n");
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