#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main() {
    int *arr = malloc(sizeof(int) * 5);
    for(int arr_i = 0; arr_i < 5; arr_i++){
       scanf("%d",&arr[arr_i]);
    }
    //int  max = arr[0];
    //int  min = arr[0];
    int a;
    for (int i = 0; i < 5; i++ ) {
      for (int j = i+1; j < 5; j++) {
        if (arr[i] > arr[j]) {
          a = arr[i];
          arr[i] = arr[j];
          arr[j] = a;
        }
      }
    }
    //printf("max:%d min:%d\n", max, min);
    //int *ass[5];
    int max;
    int min;
    //printf("max:%d,min:%d\n",max,min );
    int sum = 0;
    for (int i = 1; i < 4; i++) {
      sum = sum + arr[i];
    }
    max = sum + arr[4];
    min = sum + arr[0];
    printf("%d %d\n",max,min);

    return 0;
}
