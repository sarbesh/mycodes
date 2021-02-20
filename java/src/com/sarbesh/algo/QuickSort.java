package com.sarbesh.algo;

import java.util.Arrays;

public class QuickSort {
    /* A utility function to print array of size n */
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
        int[] arr3 = {10, 7, 8, 9, 1, 5};
        int n = arr1.length;

        QuickSort ob = new QuickSort();

        final long startTime = System.nanoTime();
        ob.sort1(arr1, 0, n-1);
        final long endTime = System.nanoTime();
        System.out.println("Method1 Total execution time: " + (endTime - startTime));

        final long startTime2 = System.nanoTime();
        ob.sort2(arr2, 0, n-1);
        final long endTime2 = System.nanoTime();
        System.out.println("Method2 Total execution time: " + (endTime2 - startTime2));

        final long startTime3 = System.nanoTime();
        Arrays.stream(arr3).sorted().forEach(System.out::print);
        final long endTime3 = System.nanoTime();
        System.out.println("\nMethod3 Total execution time: " + (endTime3 - startTime3));

//        System.out.println("sorted array");
        printArray(arr1);
        printArray(arr2);
    }
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition1(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    static int partition2(int[] arr, int low, int high){
        int pivotal = (arr[high]);
        int left = low, right = high-1;
        while (left < right){
            while((arr[left])<=pivotal){
                left++;
            }
            while(arr[right]>pivotal){
                right--;
            }
            if(left>=right){
                break;
            }
            swap(arr,left,right);
        }
        swap(arr,high,left);
        return right;
    }

    static void swap(int[] arr, int x, int y){
        int temp = arr[y];
        arr[y] = arr[x];
        arr[x] = temp;
    }


    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    void sort1(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition1(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort1(arr, low, pi-1);
            sort1(arr, pi+1, high);
        }
    }

    void sort2(int[] arr, int low, int high){
        if (low>=high) return;
        int pivotPosition = partition2(arr, low, high);
        sort2(arr,low, pivotPosition-1);
        sort2(arr, pivotPosition+1, high);
    }
}
