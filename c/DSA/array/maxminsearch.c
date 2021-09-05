#include<stdio.h>

struct pair{
		int min;
		int max;
};


//method1: n-1 comparison
struct pair maxmin1(int arr[], int n){
		struct pair minmax;
		minmax.max=arr[0];
		minmax.min=arr[0];
		int i=1;
		for(i;i<n;i++){
				if(arr[i]>minmax.max){
						minmax.max=arr[i];
				}
				if(arr[i]<minmax.min){
						minmax.min=arr[i];
				}
		}
		return minmax;
}

//method2: 
struct pair byDnC(int arr[], int low, int high){
		struct pair minmax,mml,mmr;
		int mid;
		if(low==high){
				minmax.min=arr[low];
				minmax.max=arr[high];
				return minmax;
		} else if (high == low+1){
				if(arr[low]>arr[high]){
						minmax.max=arr[low];
						minmax.min=arr[high];
				} else {
						minmax.max=arr[high];
						minmax.min=arr[low];
				}
		} else {
				mid = (low+high)/2;
				mml = byDnC(arr,low,mid);
				mmr = byDnC(arr,mid+1,high);

				if(mml.min>mmr.min){
						minmax.min=mmr.min;
				} else {
						minmax.min=mml.min;
				}
				if(mml.max>mmr.max){
						minmax.max=mml.max;
				} else {
						minmax.max=mmr.max;
				}
		}
		//printf("low: %d, high: %d, min: %d, max: %d \n",low,high,minmax.min,minmax.max);
		return minmax;
}

//method3: compare 2 at time
struct pair byCT(int arr[], int n){
		struct pair minmax;
		int i;
		if(n%2==0){
				if(arr[0]>arr[1]){
						minmax.min=arr[1];
						minmax.max=arr[0];
				} else {
						minmax.min = arr[0];
						minmax.max = arr[1];
				}
				i = 2;
		} else {
				minmax.min=arr[0];
				minmax.max=arr[0];
				i=1;
		}
		while (i<n-1){
				if(arr[i]>arr[i+1]){
						if(arr[i]>minmax.max){
								minmax.max=arr[1];
						}
						if(arr[i+1]<minmax.min){
								minmax.min=arr[i+1];
						}
				} else {
						if(arr[i+1]>minmax.max){
								minmax.max=arr[i+1];
						}
						if(arr[i]<minmax.min){
								minmax.min=arr[i];
						}
				}
				i+=2;
		}
		return minmax;
}

void main(){
		//int arr[] = {2,4,1,5,8,3,9,6,7};
		int arr[] = {3,5,2,4,1,4,45,4,7,6,97,1,5,6,37,27,8,25,27};
		int n = sizeof(arr)/sizeof(arr[0]);
		struct pair minmax = byCT(arr,n);//byDnC(arr,0,n-1);// maxmin1(arr,n);
		printf("Min: %d, Max: %d \n",minmax.min,minmax.max);
}
