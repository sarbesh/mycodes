import java.util.*;
import java.lang.*;
import java.io.*;

//Q:- https://www.codechef.com/problems/MUFFINS3

public class MUFFINS3{

	public static void main(String[] args) throws Exception{
		FastReader fs = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = fs.nextInt();
		while(T-->0){
			int N = fs.nextInt();
			int max = (N/2)+1;
			out.write(max+"\n");
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