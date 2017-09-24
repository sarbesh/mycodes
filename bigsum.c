#include <stdio.h>

int main(void){
    int n;
    long sum=0;
    scanf("%d", &n);
    long value;
    //long arr[n];
    for (int i=0; i < n; i++) {
        scanf("%li", &value);
        sum += value;
    }
    printf("%li", sum);
    return 0;
}
