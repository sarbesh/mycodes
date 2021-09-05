https://www.youtube.com/watch?v=7h1s2SojIRw
divide and conqure algo

algo for partisioning(arr,low,high):
1. consider a pivot point (at bigining or end)
2. select i=low and j=high
3. i to track values greater tha pivot and j for smaller
4. increment i till greater or equal and decrement j till smaller
5. swap(i,j) if (i\<j)
6. run (4,5) till (i\<j)
7. swap(pivot,j)
8. return j

quickSort(arr,low,high):
1. if(low\<high)
2. get pivot point j = partision(arr,low,high)
3. divide array at j
4. run quicksort on (low,j) nd (j+1,high)
5. array will be sorted

recurive  + divide and conqure + partision

time taken for one partision = n
 height => n/2/2/2/2....=1 => n/(2^k)=1 => k=log(2)(n)

 -> total time = time at each level*hight = n*log(n) => O(nlog(n)) //asumming partison is always at middle (best case)

 median  = bestcase sitting in middle

 worstcase (when sorted) = n(n+1)/2 => n^2

 so consider pivot always at middle to remove worst case

 stratergy:
 1. select middle
 2. select random

 worst still be n^2 

 space comlexity: recursive, no extra space but takes stack (log(n) to n)

 


