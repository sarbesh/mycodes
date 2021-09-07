#include "util.c"
#include <time.h>

void shift(int arr[], int N){
		clock_t start, end;
		int i=0;
		int j=0;
		printf("Before: ");
		printArray(arr,0,N);
		start = clock();
		while(j<N){
				if (arr[j]<0){
						if(i!=j){
								swapAddr(&arr[i],&arr[j]);
						}
						i++;
				}
				j++;
		}
		end = clock();
		double time = (end-start);
		printf("Took: %0.5f\n",time);
		printf("After: ");
		printArray(arr,0,N);
}

void shiftall(int arr[], int N){
		clock_t start,end;
		printf("Before: ");
		int low=0;
		int high=N-1;
		printArray(arr,0,N);
		start = clock();
		while(low<=high){
				if(arr[low]<0 && arr[high]<0){
						low+=1;
				} else if (arr[low]>0 && arr[high]<0){
						swapAddr(&arr[low],&arr[high]);
						low+=1;
						high-=1;
				} else if (arr[low]>0 && arr[high]>0){
						high-=1;
				} else {
						low+=1;
						high-=1;
				}
		}
		end = clock();
		double time = (end-start);
		printf("Took: %0.5f\n",time);
		printf("After: ");
		printArray(arr,0,N);
}

void main(){
		int arr1[] = {-12,10,-11,-13,-5,6,7,5,-3};
		int arr2[] = {-12,10,-11,-13,-5,6,7,5,-3};
		int len = sizeof(arr1)/sizeof(arr1[0]);
		shift(arr1,len); //32 ms
		shiftall(arr2,len);	//9 ms
}
