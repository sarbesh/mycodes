//#include "util.c"
#include "quickselect.c"

void main(){
	int arr[] = {1,6,2,8,4,0,9,3,7,6,5,10,11,12,13,19,18,20,15,17,14,16};
	int len = sizeof(arr)/sizeof(arr[0]);
	int k=4;
	int min = quickselect(arr,0,len-1,k-1);
	int max = quickselect(arr,0,len-1,len-1-k);

	printf("%d min: %d, max: %d",k,min,max);
}

