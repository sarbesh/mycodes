#include<stdio.h>
#include<stdlib.h>

/*
*   Search an element k in the array(sorted: as binary search works on sorted array)
*   with start index and end index
*   
*   arr: array to search
*   start: starting index
*   end: ending index
*   k: search value
*
*   return: index of the search value 
*           else -1
*/
int binarysearch(int* arr, int start, int end, int k){
    if(start==end){
        if(arr[start]==k){
            return start;
        } else {
            return -1;
        }
    }
    int mid = (start+end)/2;
    if(k==arr[mid]){
        return mid;
    }
    if(k<arr[mid]){
        return binarysearch(arr,start,mid,k);
    } else {
        return binarysearch(arr,mid+1,end,k);
    }
}

int main(int argc, char* argv[]){
    int search_index;
    // printf("argc: %d \n" ,argc);
    // printf("argv: %s \n", argv);
    // if(argc>1){
    //     if(argc==4){
    //         int size = atoi(argv[2]);
    //         int* searchArray = argv[3];
    //         int seachElement= atoi(argv[4]);
    //         search_index = binarysearch(searchArray, 0, size, seachElement);
    //     } else {
    //         printf("%d incorrect number of args",argc);
    //     }
    // } else {
    //     int searchArray[12] = {1,2,3,4,5,6,7,8,9,10,11,12};
    //     int seachElement=1;
    //     int size = sizeof(searchArray)/sizeof(int);
    //     search_index = binarysearch(searchArray, 0, size, seachElement);
    // }
    int searchArray[12] = {1,2,3,4,5,6,7,8,9,10,11,12};
    int seachElement=1;
    int size = sizeof(searchArray)/sizeof(int);
    search_index = binarysearch(searchArray, 0, size, seachElement);
    printf("index of the seach term: %d \n", search_index);
}
