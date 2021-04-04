import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;



// Remember that the class name should be "Main" and should be "public".
public class SSCRIPT {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			int N = in.nextInt();
			int K = in.nextInt();
			String S = in.nextLine();
			String[] strArr=S.split("");
			List<Integer> sol=new ArrayList<>();
			int i,count=0,flag=0;
			for(i=0;i<N;i++){
				if(strArr[i].equals("*")) sol.add(1);
				else sol.add(0);
			}
			for (i=0;i<N;i++ ) {
				if(sol.get(i)==1){
					count++;
				} else{
					if(count==K){
						flag=1;
					}
					count=0;
				}
			}
			if(count==K) flag=1;
			if(flag==1) out.write("YES\n");
			else out.write("NO\n");
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