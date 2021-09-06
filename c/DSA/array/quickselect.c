#include <stdio.h>

void printArray(int arr[], int i, int j){
		printf("Array: ");
		for(i;i<j;i++){
				printf("%d ",arr[i]);
		}
		printf("\n");
}

void swap(int arr[], int j, int i){
		if(j!=i){
				printf("swaping: %d, %d \n",i,j);
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
		}
}

int partision(int arr[], int low, int high){
		int pivot = high;
		int i = low-1;
		int j=low;

		printf("i: %d, j: %d, arr[%d]: %d \n",i,j,pivot,arr[pivot]);

		for(j;j<pivot;j++){
			printf("j: arr[%d]: %d, ",j,arr[j]);
				if(arr[j]<=arr[pivot]){
						i++;
						printf("i: arr[%d]: %d \n",i,arr[i]);
						swap(arr,i,j);
				}
		}
		swap(arr,high,i+1);
		return i+1;
}

int quickselect(int arr[],int low, int high, int k){
		if(low!=high){
			printf("low: %d, high: %d \n", low, high);
			printArray(arr,low,high);
			int pivot = partision(arr,low,high);
			printf("pivot: %d \n",pivot);
			if(k>pivot){
					return quickselect(arr,pivot+1,high,k);
			} else if (k<pivot){
					return quickselect(arr,low,pivot-1,k);
			} else {
					return pivot;
			}
		} else {
				return low;
		}
}

//void main(){
//		int arr[] = {2,6,1,8,70,4,5,30,9,0,100,10,20,50,40};
//		int k = 4;
//		int len = sizeof(arr)/sizeof(arr[0]);
//		int eind = quickselect(arr,0,len-1,k-1);
//		printf("%d smallest Element: %d",k,arr[eind]);
//}
