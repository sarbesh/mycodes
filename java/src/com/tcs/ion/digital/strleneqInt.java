import java.util.*;
import java.lang.*;
import java.io.*;

class strleneqInt{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
		int len = inp.length();
		String[] inparr = inp.split("");
		int index=0;
		StringBuilder sb = new StringBuilder();
		Boolean ans = false;
		for (int i =0; i<len ;i++ ) {
			try{
				Integer.parseInt(inparr[i]);
				sb.append(inparr[i]);
				index=i;
			} catch(NumberFormatException ex){
				break;
			}
		}
		int val = Integer.parseInt(sb.toString());
		System.out.println("val :"+val+" index :"+index+" Len :"+(len-index-1));
		if(len-index-1==val){
			ans = true;
		} else ans = false;
		System.out.println(ans);
	}
}