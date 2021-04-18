import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;



// Remember that the class name should be "Main" and should be "public".
public class MEXSTR {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			int max = (int)10^6;
			int[] num0 = new int[max];
			int[] num1 = new int[max];
			int[] dp0 = new int[max+2];
			int[] dp1 = new int[max+2];


		}
		out.flush();
	}

	static void funct(FastReader in, BufferedWriter out){
		String input = in.nextLine();
		String[] inpArr = input.split("");
		int n = input.length();
		int pos = -1;
		for (int i=0;i<n ;i++ ) {
			if(Integer.parseInt(inpArr[i])==0){
				for (int j=pos+1;j<=i ;j++ ) {
					num0[j]=i
				}
				pos=i;
			}
		}
		for (int i = pos+1;i<n ;i++ ) {
			num0[i]=n;
		}
		if (num0[0]==n) {
			out.write("0\n");
			return 0;
		}
		pos=-1;
		for (int i=0;i<n ; i++) {
			if(Integer.parseint(inpArr[i])==1){
				for (int j=pos+1;j<=i ;j++ ) {
					num1[j]=i
				}
				pos=i;
			}
		}
		if () {
			
		}
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