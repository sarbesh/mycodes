import java.util.*;
import java.lang.*;
import java.io.*;


// Remember that the class name should be "Main" and should be "public".
public class GROUPS {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.		
		int T = in.nextInt();
		while(T-->0){
			String[] inp = in.nextLine().split("");
			// int inp = in.nextInt();
			int pre = 0;
			int G = 0;
			int N = inp.length;
			for (int i=0;i<N ;i++ ) {
				int var = Integer.parseInt(inp[i]);
				if (pre==0&var==1) {
					G++;
				}
				pre=var;
			}
			out.write(G+"\n");

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