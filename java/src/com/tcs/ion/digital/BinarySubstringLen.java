import java.util.*;
import java.lang.*;

class BinarySubstringLen{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int n = sc.nextInt();
		int len = input.length();
		int q = len/n;
		int r = len%n;
		int ans=0;
		String[] inpArr = input.split("");
		for (int i=0;i<q;i++ ) {
			int j = n*i;
			int count=0;
			// String[] arr = input.substring(j,j+n-1).split("");
			for (int m=j;m<j+n;m++ ) {
				// System.out.print(m+" "+inpArr[m]);
				if(inpArr[m].equals("1")){
					count++;
				}
			}
			// System.out.println("Count: "+count);
			if(count>ans){
				ans=count;
			}
		}
		if(r!=0){
			int count=0;
			for(int m=n*q;m<len;m++){
				// System.out.print(m+" "+inpArr[m]);
				if (inpArr[m].equals("1")) {
					count++;
				}
			}
			// System.out.println("Count: "+count);
			if(count>ans){
				ans=count;
			}
		}
		System.out.println(ans);
	}
}