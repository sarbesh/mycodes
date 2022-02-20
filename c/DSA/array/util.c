#include <stdio.h>

void printArray(int arr[], int start, int end){
	printf("Array: ");
	for(start;start<end;start++){
		printf("%d ",arr[start]);
	}
	printf("\n");
}

void swap(int arr[], int i, int j){
	if(i!=j){
		printf("swapping: %d, %d \n",i,j);
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}

void swapAddr(int* a, int*b){
	if(a!=b){
		printf("Swapping a: %d, b: %d \n",*a,*b);
		int temp = *a;
		*a = *b;
		*b = temp;
	}
}

int partision(int arr[], int low, int high){
	if(low!=high){
	int i=low;
	int j=high;
	int pivot=(low+high)/2;

	printf("low: %d, high: %d, arr[%d]: %d \n",i,j,pivot,arr[pivot]);

	while(i<j){
		while(arr[i]<arr[pivot]){
			i++;
		}
		while(arr[j]>arr[pivot]){
			j--;
		}
		if(i<j){
			swap(arr,i,j);
		}
	}
	swap(arr,pivot,j);
	return j;
	}
}
