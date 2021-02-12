#include<stdio.h>

struct Rectangle{
    int length;
    int breadth;
    char x;
} r1,r2;

struct Rectangle r3,r4; //global declarations

int main(){
    struct Rectangle r5={10,5};
    r5.length=15;
    printf("%lu \n",sizeof(r5));
    return 0;
}