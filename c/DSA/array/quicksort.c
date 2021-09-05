#include <stdio.h>

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
		int pivot = (low+high)/2;
		int i=low;
		int j=high;
		printf("pivot: %d\n",arr[pivot]);
		if(i<j){
				while(arr[i]<=arr[pivot]){
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

void quicksort(int arr[], int low, int high){
		if(low<high && low!=high) {
			int pivotpos = partision(arr, low,high);
			printArray(arr,low,high);
			quicksort(arr,low,pivotpos);
			quicksort(arr,pivotpos+1,high);
		}
}
int main(){
		int arr[] = {13,15,2,6,1,9,4,0,45};
		int len = sizeof(arr)/sizeof(arr[0]);
		printArray(arr,0,len);
		quicksort(arr,0,len-1);
		printArray(arr,0,len);
		return 0;
}
