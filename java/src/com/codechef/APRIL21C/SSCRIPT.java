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
			char[] chars = new char[K];
			Arrays.fill(chars,'*');
			String rs = new String(chars);
			String s = in.nextLine();
			String[] sArray = s.split("");
			boolean check = false;
			if(K<=N){
				if(K==1){
					for(int index=0;index<N;index++){
						if(sArray[index].equals("*")){
							check=true;
							break;
						}
					}
				} else {
					for (int index=0;index<N-K;index++){
						int inrIndex=0;
						int[] indexArr = new int[N];
						if(sArray[index].equals("*")&&sArray[index+K-1].equals("*")){
							indexArr[inrIndex]=index;
							inrIndex++;
							String subStr = s.substring(index,index+K);
							if(subStr.equals(rs)){
								check =true;
								break;
							}
						}
					}
				}
			}
			if(check) out.write("YES\n");
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