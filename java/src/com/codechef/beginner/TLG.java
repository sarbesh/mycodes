import java.util.*;
import java.lang.*;
import java.io.*;


// Remember that the class name should be "Main" and should be "public".
public class TLG {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		FastReader in  = new FastReader();
		BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.		
		int T = in.nextInt();
	    int p1 = 0;
	    int p2 = 0;
	    int l1 = 0;
	    int l2 = 0;
		while (T-- > 0) {
			// Read the numbers a and b.
			p1+= in.nextInt();
			p2+= in.nextInt();
			int d1 = p1 - p2;
			int d2 = p2 - p1;
			if(d1>l1) l1=d1;
			if(d2>l2) l2=d2;
			
		}
		if(l2>l1) output.write("2 "+l2);
		else output.write("1 "+l1);
		output.flush();
	}
	
	static class FastReader{
	    BufferedReader br;
	    StringTokenizer st;
	    
	    public FastReader(){
	        br = new BufferedReader(new InputStreamReader(System.in));
	    }
	    
	    String next(){
	        while (st==null || !st.hasMoreElements()){
	            try {
	                st = new StringTokenizer(br.readLine());
	            } catch(IOException e) {
	                e.printStackTrace();
	            }
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
	    
	    String nextLine(){
	        String str="";
	        try {
	            str = br.readLine();
	        } catch(IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	    }
	    
	}

	
}