#include <stdio.h>

int main(){
  int n;
  long bign = 0;
  long bignn;
  scanf("%d",&n);
  long arr[n];
  for(int arr_i = 0; arr_i < n; arr_i++){
    scanf("%li",&arr[arr_i]);
  }
  for(int arr_i = 0; arr_i < n; arr_i++){
    bign = bign + (arr[arr_i]) ;
  }
  printf("%ld\n", bign);
  return 0;
}
