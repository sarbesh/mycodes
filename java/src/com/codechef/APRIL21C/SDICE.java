import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;



// Remember that the class name should be "Main" and should be "public".
public class SDICE {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			long N = in.nextLong();
			long ans =0;
			if(N==1) ans=20;
			else if(N==2) ans=36;
			else if(N==3) ans=51;
			else if(N>=4){
				long m = N/4;
				long r = N%4;
				if(r==0) ans+=(44*m)+16;
				else if(r==1) ans+=(44*m)+32;
				else if(r==2) ans+=(44*m)+44;
				else if(r==3) ans+=(44*m)+55;
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