import java.util.*;
import java.lang.*;
import java.io.*;

//Q https://www.codechef.com/problems/FLOW017

public class FLOW017{

	public static void main(String[] args) throws Exception{
		FastReader fs = new FastReader();
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = fs.nextInt();
		while(T-- >0){
			String[] input = fs.nextLine().split(" ");
			int N = input.length;
			// int[] sortArr = Arrays.stream(input).mapToInt(Integer::parseInt).sorted().toArray();
			int[] intArr= new int[N];
			for(int i=N;i>0;i--){
				intArr[i-1] = Integer.parseInt(input[i-1]);
			}
			quickSort(intArr,0,N-1);
			out.write(intArr[N-2]+"\n");
		}
		// out.write("Hi "+name+"\n");
		out.flush();
	}

	static void quickSort(int[] arr, int low, int high ){
		if(low<high){
			int pivot = partision(arr, low, high);
			quickSort(arr, low, pivot-1);
			quickSort(arr, pivot+1,high);
		}
	}

	static int partision(int[] arr, int low, int high){
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				swap(arr,j,i);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}

	static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	static class FastReader{
		BufferedReader br;
		StringTokenizer st;

		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String nextLine(){
			String str="";
			try{
				str=br.readLine();
			} catch (IOException e){
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