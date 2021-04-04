import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


// Remember that the class name should be "Main" and should be "public".
public class SPACEARR {
	public static void main(String[] args) throws Exception {
		// System.in and System.out are input and output streams, respectively.
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			int N = in.nextInt();
			int[] intArr = new int[N];
			int flag=0;
			int count=0;
			for(int i =0; i<N;i++){
				intArr[i]=in.nextInt();
			}
			Arrays.sort(intArr);
			for(int i=0;i<N;i++){
				if(intArr[i]>i+1){
					out.write("Second");
					flag=1;
					break;
				} else{
					count += i+1-intArr[i];
				}
			}
			if (flag==0) {
				if(count%2!=0){
					out.write("First");
				} else{
					out.write("Second");
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