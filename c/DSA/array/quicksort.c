#include <stdio.h>
#include <stdbool.h>

void printArray(int arr[], int i, int n){
		printf("Array: ");
		for (i;i<n;i++){
				printf("%d ",arr[i]);
		}
		printf("\n");
}

void swap(int arr[], int i, int j){
	if(i!=j){
		//printf("swaping ");
		//int len = sizeof(arr)/sizeof(arr[0]);
		//printArray(arr,0,len);
		printf("swaping: %d, %d \n",arr[i],arr[j]);
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}	
}

int partision(int arr[], int low, int high){
	if(low!=high){
		int pivot = arr[low];
		int i=low;
		int j=high;
		printArray(arr,low,high);
		printf("pivot: %d\n",pivot);	
		while(i<j){
				do{	
						i++;
				}while(arr[i]<=pivot);
				do{
						j--;
				}while(arr[j]>pivot);
				if(i<j){
					swap(arr,i,j);
				}
		}
		swap(arr,low,j);
		return j;
	}
}

void quicksort(int arr[], int low, int high){
		if(low<high && low!=high) {
			int pivotpos = partision(arr, low,high);
			printArray(arr,low,high);
			quicksort(arr,low,pivotpos);
			quicksort(arr,pivotpos+1,high);
		}
}
int main(){
		int arr[] = {9,13,18,8,15,2,6,1,19,4,0,7,45,3};
		int len = sizeof(arr)/sizeof(arr[0]);
		printArray(arr,0,len);
		quicksort(arr,0,len);
		printArray(arr,0,len);
		return 0;
}
