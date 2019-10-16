#include <stdio.h>

void tower(int N,char S,char A,char D){
    if(N==1)
        printf("\nMove from %d %c to %c",N,S,D);
    else{
        tower(N-1,S,A,D);
        printf("\nMove from %d tower %c to tower %c",N,S,D);
        tower(N-1,A,S,D);
        //printf("\nMove from %d tower %c to %c",N,S,D);
    }
}
void main(){
    int n;
    printf("\nenter N:");
    scanf("%d", &n);
    char S,A,D;
    tower(n,S,A,D);
}
