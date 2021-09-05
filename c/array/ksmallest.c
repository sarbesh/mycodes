#include<stdio.h>

int findSmallest(int arr[], int k){
		int size = sizeof(arr)/sizeof(arr[0]);

}


void main(){
		int arr[] = {3,25,65,74,154,72,7235,26,97,9,1,4,8,32,6,8};
		int k = 5;
		int small = findSmallest(arr,k);
		printf("%dth Smallest: %d",k,small);
}
