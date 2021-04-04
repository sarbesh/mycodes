import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


// Remember that the class name should be "Main" and should be "public".
public class COLGLF4 {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			String[] inputs = in.nextLine().split(" ");
			int N = Integer.parseInt(inputs[0]);
			int E = Integer.parseInt(inputs[1]);
			int H = Integer.parseInt(inputs[2]);
			int A = Integer.parseInt(inputs[3]);
			int B = Integer.parseInt(inputs[4]);
			int C = Integer.parseInt(inputs[5]);
			
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