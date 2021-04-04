import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


// Remember that the class name should be "Main" and should be "public".
public class NFS {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			int u = in.nextInt();
			int v = in.nextInt();
			int a = in.nextInt();
			int s = in.nextInt();
			if(u<=v){
				out.write("Yes\n");
			} else{
				long V = ((u*u)-(2*a*s));
				if(V<=(v*v)){
					out.write("Yes\n");
				} else {
					out.write("No\n");
				}
			}
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