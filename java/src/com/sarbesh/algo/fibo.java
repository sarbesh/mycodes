import java.util.*;
import java.lang.*;

class fibo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		//recursive
		long start = System.nanoTime();
		int ans = recur(num);
		long time = System.nanoTime() - start;
		System.out.println("Recurssive: "+time+", ans: "+ans);
		

		//Tabulation = Bottom-Up Time: 
		 start = System.nanoTime();
		 ans = bottonUp(num);
		 time = System.nanoTime() - start;
		System.out.println("BottomUp: "+time+", ans: "+ans);


		//Memorization = Top-Down Time: O(n) Space : O(n)
		 start = System.nanoTime();
		 ans = topDown(num);
		 time = System.nanoTime() - start;
		System.out.println("TopDown: "+time+", ans: "+ans);

		// System.out.println(ans);
	}

	public static int recur(int n){
		if(n<=1){
			return n;
		}
		return recur(n-1)+recur(n-2);
	}

	public static int bottonUp(int n){
		int[] arr = new int[n+1];
		for(int i=0;i<n+1;i++){
			findFiboBottonUp(i,arr);
		}
		return arr[n];
	}

	public static void findFiboBottonUp(int n, int[] arr){
		if(n==0 || n==1){
			arr[n]=n;
		} else {
			arr[n]=arr[n-1]+arr[n-2];
		}
	}

	public static int topDown(int n){
		int MAX = 100;
		int NIL = -1;
		int table[] = new int[MAX];
		for(int i=0;i<MAX;i++){
			table[i]=NIL;
		}
		return fib(n,table,NIL);
	}

	public static int fib(int n, int[] lookup, int NILL){
	    if (lookup[n] == NILL)
	    {
	      if (n <= 1)
	          lookup[n] = n;
	      else
	          lookup[n] = fib(n-1,lookup,NILL) + fib(n-2,lookup,NILL);
	    }
	    return lookup[n];
	  }
}