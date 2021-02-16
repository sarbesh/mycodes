import java.util.*;
import java.lang.*;
import java.io.*;

//Q: https://www.codechef.com/problems/CHOPRT

class CHOPRT{
	public static void main(String[] args) throws Exception{
		FastReader fs = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = fs.nextInt();
		while(T-->0){
			String[] inp = fs.nextLine().split(" ");
			int a = Integer.parseInt(inp[0]);
			int b = Integer.parseInt(inp[1]);
			if(a<b) out.write("<\n");
			else if(a>b) out.write(">\n");
			else out.write("=\n");
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
			String str = "";
			try{
				str = br.readLine();
			} catch(IOException e){
				throw new RuntimeException(e);
			}
			return str;
		}

		String next(){
			while(st==null || !st.hasMoreElements()){
				st = new StringTokenizer(nextLine());
			}
			return st.nextToken();
		}

		int nextInt(){
			return Integer.parseInt(next());
		}
	}
}