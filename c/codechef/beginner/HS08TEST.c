#include <stdio.h>

int main(void) {
	// your code goes here
	int x;
	float y;
	float z =0.50; 
	scanf("%d %f", &x, &y);
	if (x%5==0 && x<=y-z)
	{
		printf("%.2f\n", y-x-z );
	} else {
		printf("%.2f\n", y);
	}
	return 0;
}
