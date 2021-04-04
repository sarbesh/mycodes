import java.util.*;
import java.lang.*;
import java.math.*;

public class Reversort{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0;t<T;t++){
            int N = sc.nextInt();
            int[] intArr = new int[N];
            for(int i=0;i<N;i++){
                intArr[i] = sc.nextInt();
            }
            int c = reverseSort(intArr,N);
            int cas = t+1;
            System.out.println("Case #"+cas+": "+c);
        }
    }
    
    static int reverseSort(int[] L, int N){
        int fCost=0;
        int cost=0;
        for(int i=1; i<N; i++){
            int j = minInd(L, i-1, N)+1;
            reverse(L, i-1, j);
            cost = j-i+1;
            fCost=fCost+cost;
        }
        return fCost;
    }
    
    static int minInd(int[] arr, int i, int N){
        int min = arr[i];
        int pos = i;
        for(int j=i+1; j<N;j++){
            if(arr[j]<min){
                min = arr[j];
                pos = j;
            }
        }
        return pos;
    }
    
    static void reverse(int[] arr, int i, int j){
        Arrays.sort(arr,i,j);
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}