import java.util.*;
import java.lang.*;
import java.io.*;


// Remember that the class name should be "Main" and should be "public".
public class NOTIME {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.		
		String[] inp1 = in.nextLine().split(" ");
		String[] inp2 = in.nextLine().split(" ");
		int N = Integer.parseInt(inp1[0]);
		int H = Integer.parseInt(inp1[1]);
		int x = Integer.parseInt(inp1[2]);
		int diff = H - x;
		boolean res = false;
		for (int i=N-1;i>=0;i-- ) {
			if(Integer.parseInt(inp2[i])>=diff){
				res=true;
			}
		}
		if(res){
			out.write("YES");
		} else{
			out.write("NO");
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