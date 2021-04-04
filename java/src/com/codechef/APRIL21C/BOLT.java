import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.text.DecimalFormat;


// Remember that the class name should be "Main" and should be "public".
public class BOLT {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int L = 100;
		Double T = 9.58;
		int N = in.nextInt();
		DecimalFormat df = new DecimalFormat("###.##");   
		while(N-->0){
			Double k1 = in.nextDouble();
			Double k2 = in.nextDouble();
			Double k3 = in.nextDouble();
			Double v = in.nextDouble();
			Double V = k1*k2*k3*v;
// 			V = Double.parseDouble(df.format(V));
			Double t = L/V;
			t = Double.parseDouble(df.format(t));
// 			out.write(String.valueOf(t)+"\n");
			if(t<T) out.write("YES\n");
			else out.write("NO\n");
// 			out.write(rating.get(0)+"\n");		
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