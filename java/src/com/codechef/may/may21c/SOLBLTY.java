import java.util*;
import java.lang.*;

class SOLBLTY{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
			String[] inpArr = sc.nextLine().split(" ");
			int X = Integer.parseInt(inpArr[0]);
			int A = Integer.parseInt(inpArr[1]);
			int B = Integer.parseInt(inpArr[2]);
			int ans = (A+((100-X)*B))*10;
			System.out.println(ans);
		}
	}

}