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
			String[] inputs = in.nextLine().split(" ");
			long D = Long.parseLong(inputs[0]);
			long d = Long.parseLong(inputs[1]);
			long P = Long.parseLong(inputs[2]);
			long Q = Long.parseLong(inputs[3]);

			long i = D/d;
			long n = i-1;
			long q = D%d;

			long ans=0;

// 			ans = (d)*(((i)*P)+Q((n*(n-1))/2));
// 			ans += (q)*(P+(Q*i));

			ans = ((((i*P)+(((n*(n+1))/2)*Q))*d)+((P+(i*Q))*q));
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