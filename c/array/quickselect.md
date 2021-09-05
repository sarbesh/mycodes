same as quicksort : partision algo

1 3 2 4 8 5

find 2nd smallest element k=2

run partision using pivot as last element and i=low-1,j=low

=> this would give you an array which has elements less than pivot on right and greater on left

1 3 2 4 _5_ 8

if(pivot+1==k) then we found else if greater select left else right

partision on last ele with the left array

1 3 2 4 => 1 3 2 _4_ j=3 => 3+1!=2

1 3 _2_ => 1 _2_ 3 j=1 => 1+1==2 => arr[2] = 2

diadvantage: O(n^2),O(n)


