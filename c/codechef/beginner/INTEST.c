#include <stdio.h>

int main(int argc, char const *argv[])
{
	/* code */
	long n;
	long k;
	long count = 0;
	scanf("%d %d", &n, &k);
	// printf("out:- %d %d\n",n, k);
	for (int i = 0; i < n; ++i){
		long a = 0;
		scanf("%d ", &a);
		// printf("loop:- %d %d %d %d \n", n, k, a, count);
		if (a%k==0)
		{
			count = count+1;
		}
		// printf("%d \n", count );
	}
	printf("%d \n", count);
	return 0;
}