import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;



// Remember that the class name should be "Main" and should be "public".
public class Main {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		long MODULO = 1000000007;
		long[] longArr = new Long[MODULO];
		longArr[1] = 2;
		for(int i=2; i<MODULO; i++){
			longArr[i] = 2*longArr[i-1]%MODULO;
		}
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			String[] inputs = in.nextLine().split(" ");
			long N = Long.parseLong(inputs[0]);
			long M = Long.parseLong(inputs[1]);
			long ans = 0;

			if(N==1 & M==2){
				ans = 1;
			} else {
				ans = power(longArr[N]-1,M,MODULO);
			}
			
			out.write(ans+"\n");		
		}
		out.flush();
	}

	static long power(long x, long y, long p)
	  {
	    long res = 1; // Initialize result
	 
	    x = x % p; // Update x if it is more than or
	    // equal to p
	 
	    if (x == 0)
	      return 0; // In case x is divisible by p;
	 
	    while (y > 0)
	    {
	 
	      // If y is odd, multiply x with result
	      if ((y & 1) != 0)
	        res = (res * x) % p;
	 
	      // y must be even now
	      y = y >> 1; // y = y/2
	      x = (x * x) % p;
	    }
	    return res;
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