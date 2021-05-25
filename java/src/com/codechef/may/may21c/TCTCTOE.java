import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;



// Remember that the class name should be "Main" and should be "public".
public class TCTCTOE {
	public static void main(String[] args) throws Exception {
		FastReader in  = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		// Read the number of test casese.	
		int T = in.nextInt();
		while(T-->0){
			int cx=0,co=0,n=0,wx=0,wo=0,ans = 0;

			String a[][] = new String[3][3]; 

			for (int i =0;i<3 ;i++ ) {
				String[] inp = in.nextLine().split("");
				for (int j=0;j<3 ;j++ ) {
					String varl = inp[j];
					a[i][j]=varl;
					if (varl.equals("X")) {
						cx+=1;
					} else if(varl.equals("O")){
						co+=1;
					} else{
						n+=1;
					}
				}
			}
			
			if (a[0][0].equals("X") && a[0][1].equals("X") && a[0][2].equals("X") ) {
				wx=1;
			}
			if (a[1][0].equals("X") && a[1][1].equals("X") && a[1][2].equals("X") ) {
				wx=1;
			}
			if (a[2][0].equals("X") && a[2][1].equals("X") && a[2][2].equals("X") ) {
				wx=1;
			}
			if (a[0][0].equals("X") && a[1][0].equals("X") && a[2][0].equals("X") ) {
				wx=1;
			}
			if (a[0][1].equals("X") && a[1][1].equals("X") && a[2][1].equals("X") ) {
				wx=1;
			}
			if (a[0][2].equals("X") && a[1][2].equals("X") && a[2][2].equals("X") ) {
				wx=1;
			}
			if (a[0][0].equals("X") && a[1][1].equals("X") && a[2][2].equals("X") ) {
				wx=1;
			}
			if (a[0][2].equals("X") && a[1][1].equals("X") && a[2][0].equals("X") ) {
				wx=1;
			}

			if (a[0][0].equals("O") && a[0][1].equals("O") && a[0][2].equals("O") ) {
				wo=1;
			}
			if (a[1][0].equals("O") && a[1][1].equals("O") && a[1][2].equals("O") ) {
				wo=1;
			}
			if (a[2][0].equals("O") && a[2][1].equals("O") && a[2][2].equals("O") ) {
				wo=1;
			}
			if (a[0][0].equals("O") && a[1][0].equals("O") && a[2][0].equals("O") ) {
				wo=1;
			}
			if (a[0][1].equals("O") && a[1][1].equals("O") && a[2][1].equals("O") ) {
				wo=1;
			}
			if (a[0][2].equals("O") && a[1][2].equals("O") && a[2][2].equals("O") ) {
				wo=1;
			}
			if (a[0][0].equals("O") && a[1][1].equals("O") && a[2][2].equals("O") ) {
				wo=1;
			}
			if (a[0][2].equals("O") && a[1][1].equals("O") && a[2][0].equals("O") ) {
				wo=1;
			}

			if ((wx==1 && wo==1) || (cx-co<0) || (cx-co>1))  {
				ans=3;
			} else if (cx==0 && co==0 && n==0) {
				ans=2;
			} else if (wx==1 && wo==0 && cx>co) {
				ans=1;
			} else if (wx==0 && wo==1 && cx==co) {
				ans=1;
			} else if (wx==0 && wo==0 && n==0) {
				ans=1;
			} else if (wx==0 && wo==0 && n>0) {
				ans=2;
			} else{
				ans=3;
			}

			out.write(ans+"\n");		
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