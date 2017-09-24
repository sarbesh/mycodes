#include<stdio.h>

void main(){
  int a, b , i, count = 0, sum = 0, x;
  printf("\nEnter the first value:");
  scanf("%i", &a);
  printf("\nEnter the second value:");
  scanf("%i", &b);
  for (i = a; i <= b; i++) {          //loop for the numbers from the range
    for (x = 1; x <=i ; x++) {        //loop for the finding the divisors 
      if (i%x==0) {
        count = count + 1;            //if you want to know how many divisors use this
        sum = sum + 1;                //to find the sum of the divisors
      }
    }
  }
  printf("sum: %d", sum);           //sum of divisors
  printf("count: %d", count);       //number of divisors
}
