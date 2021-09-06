#include "util.c"

void sort012(int arr[], int N){
		printf("Input ");
		printArray(arr,0,N);
		printf("\n");
		int low=0;
		int high = N-1;
		int mid=0;

		while(mid<=high){
			printf("low: %d, mid: %d, high: %d, ele: %d \n",low,mid,high,arr[mid]);
				switch(arr[mid]){
						case 0:
								swapAddr(&arr[low++],&arr[mid++]);
								break;
						case 1:
								mid++;
								break;
						case 2:
								swapAddr(&arr[mid],&arr[high--]);
								break;
				}
				printArray(arr,0,N);
				printf("\n");
		}
}

void main(){
		int arr[] = {0,0,1,0,2,1,0,2,1,0,1,0,2,0,1,1,2,2,0,1,0,1,0,2,1,1,0,2,1};
		int N = sizeof(arr)/sizeof(arr[0]);
		sort012(arr,N);
		printf("Output");
		printArray(arr,0,N);
}
