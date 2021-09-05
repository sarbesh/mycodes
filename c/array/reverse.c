#include <stdio.h>

void reverseArray(int arr[], int start, int end){
		int temp;
		while(start < end){
				temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				start++;
				end--;
		}
}

void printArray(int arr[], int n){
		int i;
		for(i=0;i<n;i++){
				printf(" %d ",arr[i]);
		}
}

void main(){
	int arr[] = {1,2,3,4,5,6};
	int n = sizeof(arr)/sizeof(arr[0]);
	reverseArray(arr,0,n-1);
	for(int i=0;i<n;i++){
			printf(" %d ",arr[i]);
	}
}
