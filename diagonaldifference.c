#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n;
    int p = 0, sum = 0, b = 0, t = 0;
    printf("Enter the order of the matix:");
    scanf("%d",&n);
    printf("Enter the co-efficients\n");
    int array[n][n];
    for(int a_i = 0; a_i < n; a_i++){
       for(int a_j = 0; a_j < n; a_j++){
         //printf("Enter the value for elements:\n", &array[a_i][a_j] );
         scanf("%d",&array[a_i][a_j]);
       }
    }
    for (int i = 0; i < n; ++i)
    {
      for (int j = 0; j < n; ++j)
      {
        printf(" %d", array[i][j]);
      }
      printf("\n");
    }
    for (int i = 0; i < n; ++i)
    {
      sum = sum + array[i][i];
      p = p + array[i][n - i - 1];
    }
    t = sum + p;
    if (sum >= p) {
      b = sum - p;
    } else {
      b = p - sum;
    }
    printf("\nThe sum of the main diagonal elements is = %d\n", sum);
    printf("The sum of the off diagonal elemets is   = %d\n", p);
    printf("sum of diagonal: %d\n", t);
    printf("difference between diagonal:%d \n", b);
    return 0;
}
