#include <stdio.h>

void main(int argc, char** argv)
{
    int a[argc];
    for(int i = 1; i <= argc; i++)
    {
        a[i]=argv[i];
    }
    bubblesort(a);
    //return 0;
}

int bubblesort(int a){
    printf("%d",a);
}
