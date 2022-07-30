#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

int multi(int start, int end){
	if(end==1 || end==0){
		return 1;
	}
	if(start==end){
		return start;
	}
	int mid = (start+end)/2;
	return multi(start,mid)*multi(mid+1,end);
}

int main(){
	int mul = multi(0,5);
	printf("multi: %d",mul);
}
