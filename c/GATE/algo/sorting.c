#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

void swap(int* arr, int i, int j){
    // printf("\n swapping %d: %d, %d: %d\n", i,arr[i],j,arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp; 
}

/*
* time: O(n^2)
* find min in unsorted array and swap to start
*      repeat again from the next element
* 
*   length: n => one scan=k steps
*   each iteration reduces segment by 1 => 
*   t(n) = n+(n-1)+(n-1)+.....+1 = n(n+1)/2 = n^2
*  
*   return:
*/
void selectionsort(int* arr, int start, int end){
    if(start==end){
        return ;
    } else {
        int minops = start;
        for (size_t i = start; i < end; i++)
        {   
            /* code */
            if(arr[i]<=arr[minops]){
                minops = i;
            }
        }
        swap(arr, start, minops);
        selectionsort(arr,start+1,end);
    }
}

void insertsort(int* arr, int start){
    int pos=start;
    while(pos>0 && arr[pos]<arr[pos-1]){
        swap(arr, pos, pos-1);
        pos--;
    }
}
/*
* consider array as segment of sorted and unsorted segment
* first element: keep in same position  -   arr[0]- consider sorted seg and rest unsorted
* second : compare with first and swap both if required => arr[0],arr[1] now sorted
* third : place the element in appropirate postion in the sorted segment
* .......
*/
void insertionsort(int* arr, int start, int end){
    if(start >= end-1){
        return;
    } else {
        insertsort(arr, start);
        insertionsort(arr,start+1,end);
    }
}

void mergingsort(){
    int N,m,n;
    m=4, n=6, N=m+n;
    int a[4] = {2,4,1,5};
    int b[6] = {3,6,7,9,8,0};
    insertionsort(a, 0, m);
    selectionsort(b, 0, n);
    int i=0, j=0, k=0;
    int c[N];
    while(k < N){
        if(j==n || (i<m && a[i]<=b[j])){
            c[k] = a[i];
            i++; k++;
        }
        if(i==m || (j<n && a[i]>b[j])){
            c[k]=b[j];
            j++; k++;
        }
    }
    for(int i=0; i<N; i++){
        printf("%d,",c[i]);
    }
}

void discardDuplicates(){
    int m,n;
    m=4, n=4;
    int a[4] = {1,2,3,4};
    int b[4] = {2,4,1,5};
    selectionsort(a, 0, 4);
    insertionsort(b, 0, 4);
    int i,j,k;
    i=0, j=0, k=0;
    int c[m+n];
    while(k<m+n){
        if(a[i]==b[j]){
            c[k]=a[i];
            i++,j++,k++;
        }
        if(j==n || (i<m && a[i]<b[j])){
            c[k] = a[i];
            i++; k++;
        }
        if(i==m || (j<n && a[i]>b[j])){
            c[k]=b[j];
            j++; k++;
        }
    }
    printf("duplicate: ");
    for(int i=0; i<k; i++){
        printf("%d,",c[i]);
    }
    printf("\n");
}

void findIntersection(){
    int m,n;
    m=4, n=4;
    int a[4] = {1,2,3,4};
    int b[4] = {2,4,1,5};
    selectionsort(a, 0, 4);
    insertionsort(b, 0, 4);
    int i,j,k;
    i=0, j=0, k=0;
    int c[m+n];
    while(k<4){ //max(m,n)
        if(a[i]==b[j]){
            c[k]=a[i];
            k++,i++,j++;
        } else {
            if(j==m || a[i]<b[j]){
                i++;
            }
            if(i==n || a[i]>b[j]){
                j++;
            }
        }
    }
    printf("intersection: ");
    for(int i=0; i<k; i++){
        printf("%d,",c[i]);
    }
    printf("\n");
}

void findDifference(){
    int m,n;
    m=4, n=4;
    int a[4] = {1,2,3,4};
    int b[4] = {2,4,1,5};
    selectionsort(a, 0, 4);
    insertionsort(b, 0, 4);
    int i,j,k;
    i=0, j=0, k=0;
    int c[m+n];
    while(k<m+n){
        if(a[i]==b[j] && i<m && j<n){
            i++,j++;
        } else {
            if(j==n || (i<m && a[i]<b[j])){
                c[k] = a[i];
                i++; k++;
            }
            if(i==m || (j<n && a[i]>b[j])){
                j++;
            }
        }
    }
    printf("difference: ");
    for(int i=0; i<k; i++){
        printf("%d,",c[i]);
    }
    printf("\n");
}

struct sorting
{
    /* data */
    int* arr;
    int start;
    int end;
};


/*
* get median point for an array with start and end indexe's
* this method uses the original proposed algorithem by Tony Hoare
* in the early 1960's
*
* This considers the first element as pivot element and two pointers left and right
* we will try to have the element's lower to the left smaller than pivot and
* higher to the right greater than the pivot
*
* left start's after pivot and right at the end
* increment left untill you find value greater than pivot
* decrement right untill you find value lower than pivot
* swap the left and right index values and inc/dec them respectively
* 
*/
int pivotpartision(int *arr, int start, int end){ 
    printf("\nstart: %d, end: %d \t",start,end);
    int pivot = arr[start];
    int left = start+1;  //if left=start+1 -> (1), if left=start ->(2)
    int right = end; 
    while(left<=right){  // (1) -> left<=right, (2) -> left<right
        while(arr[left]<=pivot){ 
            left++; 
        }
        while(arr[right]>pivot){ 
            right--; 
        }
        if(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    if(start!=right){
        swap(arr, start, right);
    }
    // printf("\t right: %d, left: %d \n",right,left);
    return right;
}

void *quicksort2(void *arg){
    struct sorting *args = arg; 
    int* arr = args -> arr;
    int start = args -> start;
    int end = args -> end;
    if(start<end){ 
        pthread_t threads[2];
        int pivot = pivotpartision(arr,start,end);
        // quicksort2(arr,start,pivot-1);
        // quicksort2(arr,pivot+1,end);
        struct sorting s1;
        s1.arr=arr;
        s1.start=start;
        s1.end=pivot-1;
        struct sorting s2;
        s2.arr=arr;
        s2.start=pivot+1;
        s2.end=end;
        int rc1;
        int rc2;
        rc1 = pthread_create(&threads[0], NULL, &quicksort2, (void *)&s1 );
        rc2 = pthread_create(&threads[1], NULL, &quicksort2, (void *)&s2 );
        if(rc1){
            printf("Error:unable to create thread, %d\n", rc1);
            exit(-1);
        }
        if(rc2){
            printf("Error:unable to create thread, %d\n", rc2);
            exit(-1);
        }
        pthread_join(threads[0], NULL);
        pthread_join(threads[1], NULL);
        // pthread_exit(NULL);
    }
}

int main(){
    int arr[20] = {10,4,2,1,8,9,5,7,6,3,15,13,14,17,18,12,16,11,19,20};
    int size = sizeof(arr)/sizeof(int);
    printf("\nbefore: \n");
    for(int i=0; i<size; i++){
        printf("%d,",arr[i]);
    }
    // selectionsort(arr,0,size);
    // insertionsort(arr, 0, size);
    // mergingsort();
    // discardDuplicates();
    // findIntersection();
    // findDifference();
    pthread_t threads[1];
    struct sorting s;
    s.arr = arr;
    s.start=0;
    s.end=size-1;
    int rc;
    rc = pthread_create(&threads[0], NULL, &quicksort2, (void *)&s );
    if(rc){
        printf("Error:unable to create thread, %d\n", rc);
        exit(-1);
    }
    pthread_join(threads[0], NULL);
    printf("\nafter: \n");
    for(int i=0; i<size; i++){
        printf("%d,",arr[i]);
    }
    return 0;
    // pthread_exit(NULL);
}