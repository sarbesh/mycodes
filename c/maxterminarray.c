#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int birthdayCakeCandles(int n, int ar_size, int* arr) {
  int max = arr[0];
  //int count = 0;
    for (int i=0; i < n ; i++) {
      if (arr[i] >= max) {
        max = arr[i];
      } /*else {
        count = count + 1;
      }*/
    }
    int blow =0;
    //printf("count:%d\n",count);
    for (int i = 0; i < n; i++) {
      if (arr[i] == max) {
        blow = blow +1;
      }
    }
    //printf("blow:%d\n",blow );
    return blow;
}

int main() {
    int n;
    scanf("%i", &n);
    int *arr = malloc(sizeof(int) * n);
    for(int ar_i = 0; ar_i < n; ar_i++){
       scanf("%i",&arr[ar_i]);
    }
    int result = birthdayCakeCandles(n, n, arr);
    printf("%d\n", result);
    return 0;
}
