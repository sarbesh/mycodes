import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


// Remember that the class name should be "Main" and should be "public".
public class RACINGEN {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int N = in.nextInt();
		while(N-->0){
			int X = in.nextInt();
			int R = in.nextInt()*60;
			int M = in.nextInt()*60;
			int T =0,run=0,x=X;
			while((T<=M && run<=R)){
				// if(T>=M || run>=R){
				// 	break;
				// }
				// T=T+X;
				if(T<=M-X){
					if(x==0){
						x=X;
						T=T+X;
					} else if(run<=R){
						T=T+X;
						run=run+X;
						x=x-X;
					} else{
						break;
					}
				} else{
					break;
				}
				// if(x==0&&T<=M){
				// 	x=X;
				// } else{
				// 	run=run+X;
				// 	x=x-X;
				// }
				// out.write("T: "+T+",Run: "+run+",X: "+x+"\n");
			};
			out.write("T: "+T+",Run: "+run+",X: "+x+"\n");
			if(T<=M && run==R){
				out.write("YES\n");
			} else{
				out.write("NO\n");
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