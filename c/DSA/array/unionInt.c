#include "util.c"

void findUnion(int A[], int B[], int m, int n, int res[]){
		int a=0;
		int b=0;
		int c=0;
		int len = 0;
		if(m>n){
				len=n;
		} else if (m<n){
				len=m;
		} else {
				len=m;
		}

		while(len>0){
			if(A[a]>B[b]){
					res[c]=B[b];
					printf("%d ",B[b]);
					b++;
			} else if (A[a]<B[b]){
					res[c]=A[a];
					printf("%d ",A[a]);
					a++;
			} else {
					res[c]=A[a];
					printf("%d ",A[a]);
					a++;
					b++;
			}
			c++;
			len--;
		}

		while(a<m){
				res[c]=A[a];
				printf("%d ",A[a]);
				a++;
		}
		while(b<n){
				res[c]=B[b];
				printf("%d ",B[b]);
				b++;
		}
		printf("\n");
}

void quicksort(int arr[], int low, int high){
		if(low<high && low!=high){
			int pivot = partision(arr,low,high);
			quicksort(arr,low, pivot);
			quicksort(arr,pivot+1,high);
		}
}

int main(){
		int A[] = {3,6,8,12,14,15,18,13,2,9};
		int m = sizeof(A)/sizeof(A[0]);
		quicksort(A,0,m-1);
		printArray(A,0,m);
		int B[] = {1,3,5,2,15,18,16,10,14,17};	
		int n = sizeof(B)/sizeof(B[0]);
		quicksort(B,0,n-1);
		printArray(B,0,n);
		int res[m+n];
		findUnion(A,B,m,n,res);
		int len = sizeof(res)/sizeof(res[0]);
		printArray(res,0,len);
		return 0;
}
