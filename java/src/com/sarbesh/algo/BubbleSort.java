package com.sarbesh.algo;

public class BubbleSort {

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr1[] = {10, 7, 8, 9, 1, 5};
        int arr2[] = {10, 7, 8, 9, 1, 5};
        int n = arr1.length;

        BubbleSort ob = new BubbleSort();

        final long startTime = System.nanoTime();
        ob.bubbleSort1(arr1);
        final long endTime = System.nanoTime();
        System.out.println("Method1 Total execution time: " + (endTime - startTime));

        final long startTime2 = System.nanoTime();
        ob.bubleSort2(arr2);
        final long endTime2 = System.nanoTime();
        System.out.println("Method2 Total execution time: " + (endTime2 - startTime2));

//        System.out.println("sorted array");
        printArray(arr1);
        printArray(arr2);
    }

    void bubbleSort1(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++){
            swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                // swap temp and arr[i]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                swap(arr, j, j + 1);
                swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    void bubleSort2(int[] arr){
        int N = arr.length;
        boolean swapped;
        for (int i =0; i<N-1; i++){
            swapped=false;
            for(int j=i+1; j<N; j++){
                if (arr[i]>arr[j]){
                    swap(arr,i,j);
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }

    void swap(int[] arr, int x, int y){
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }
}
