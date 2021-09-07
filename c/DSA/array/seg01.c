#include "util.c"

void segregate01(int arr[], int N){
		int type0=0;
		int type1=N-1;

		while(type0<type1){
				if(arr[type0]==1){
						swapAddr(&arr[type0],&arr[type1]);
						type1--;
				} else type0++;
				printArray(arr,0,N);
				printf("\n");
		}
}

void main(){
		int arr[] = {0,1,0,1,1,1,1,0,0,0,0,1,0,0,1,1,1,0,0,0,0,1,1,1,1,0,1,1};
		int len = sizeof(arr)/sizeof(arr[0]);
		printf("Input: ");
		printArray(arr,0,len);
		printf("\n");
		segregate01(arr,len);
		printf("\nOutput: ");
		printArray(arr,0,len);
}
