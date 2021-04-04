#include <stdio.h>

int main(void) {
	// your code goes here
	int a,b,c;
	scanf("%d",&a);
	scanf("%d",&b);
	scanf("%d",&c);
	if(a==b || b==c || c==a){
	    printf("YES\n");
	} else {
	    printf("NO\n");
	}
	return 0;
}

