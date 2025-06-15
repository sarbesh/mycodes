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
* once left>right
* swap(pivot,right)
* return right point as it is median
*/
int orgpivotpartision(int *arr, int start, int end){ 
    // printf("\n ORG: \n");
    // printf("\nstart: %d, end: %d \t",start,end);
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

/*
* Another variation for obtaining a median of an array
* such that elements to the left as smaller than median
* and elements to the right is greater than median.
*/
int pivotpartision(int* arr, int start, int end){
    // printf("\n OPT: \n");
    if(end>start){
        // printf("\nstart: %d, end: %d \t",start,end);
        int pivot = arr[start];
        int left = start+1;
        int right = start+1;
        while(right<=end){
            if(arr[right]<=pivot){
                if(left!=right){
                    swap(arr,left,right);
                }
                left++;
            }
            right++;
        }
        swap(arr,start,left-1);
        // printf("\t right: %d, left: %d \n",right,left);
        return left-1;
    }
}

void *quicksort(void *arg){
    struct sorting *args = arg; 
    int* arr = args -> arr;
    int start = args -> start;
    int end = args -> end;
    if(start<end){ 
        pthread_t threads[2];
        int pivot;
        if(end-start%2==0){
            pivot = orgpivotpartision(arr,start,end);
        } else {
            pivot = pivotpartision(arr,start,end);
        }
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
        rc1 = pthread_create(&threads[0], NULL, &quicksort, (void *)&s1 );
        rc2 = pthread_create(&threads[1], NULL, &quicksort, (void *)&s2 );
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
    int arr[591] = {1,2,236,257,3,333,348,368,393,4,48,493,5,6,10,11,12,13,14,15,16,17,177,18,19,194,20,202,204,21,215,22,228,229,23,230,231,234,239,24,248,25,255,259,26,260,27,272,273,274,277,28,281,284,285,287,289,29,291,30,305,31,310,312,316,32,323,326,33,34,35,355,36,363,369,37,370,38,39,392,395,40,41,42,43,44,445,454,455,461,462,475,481,488,49,494,496,50,518,519,571,589,7,8,827,9,100,101,102,103,104,105,106,107,108,109,179,180,181,184,196,200,203,205,206,207,209,210,211,213,216,232,240,244,250,268,276,278,280,286,295,313,325,329,335,341,361,389,463,473,528,529,543,568,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,173,174,187,190,191,218,219,220,221,222,223,224,225,235,242,251,254,256,263,266,279,303,306,315,331,349,359,372,381,385,388,394,401,410,411,412,421,437,450,451,452,458,459,46,464,466,47,498,51,52,520,521,53,54,55,56,565,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,813,82,130,131,132,133,134,135,253,270,307,346,391,409,479,530,137,138,328,441,447,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,185,208,226,243,246,247,261,264,271,292,296,301,308,309,314,319,322,330,336,337,347,351,356,379,418,428,433,460,472,474,497,522,523,567,812,169,170,171,175,198,199,300,415,422,476,531,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,182,186,227,233,241,265,282,288,293,294,302,311,320,324,327,342,343,350,357,366,374,376,390,414,426,430,438,471,477,483,526,527,572,157,159,160,161,162,163,164,165,166,167,168,183,189,192,217,238,252,262,267,275,283,297,299,304,317,318,334,345,354,367,406,431,449,467,478,511,600,801,125,193,249,298,384,423,443,446,490,512,513,176,195,386,408,429,439,517,591,136,172,214,258,178,212,237,332,45,127,128,129,321,380,823,126,188,405,425,442,373,595,201,290,352,353,362,484,500,822,245,435,491,339,344,358,364,382,383,400,416,432,457,470,480,489,492,495,499,532,360,377,436,371,378,365,456,525,387,514,396,397,398,515,402,403,404,407,434,468,516,417,465,420,424,440,448,482,809,427,524,825,444,550,552,547,548,551,549,546,556,553,562,554,557,824,555,816,804,560,561,578,579,581,580,582,583,584,588,590,592,597,596,803,802,806,805,807,811,808,810,814,815,817,821,828,535,536,537,503,540,544,545,506,508,539,507,501,502,509,538,510,598,599,504,505,541,542};
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
    rc = pthread_create(&threads[0], NULL, &quicksort, (void *)&s );
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