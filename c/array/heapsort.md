Heap sort:

The array left after removing all the elements from heap and adding it to the space created after deletion will be a sorted heap.

steps: 
1. Create a Heap
2. Delete all the Elemnts

Example: 10 20 15 30 40
Creating Heap
	1. 10
	2. 10,20 -> 20,10
	3. 20,10,15
	4. 20,10,15,30 -> 20,30,15,10 -> 30,20,15,10
	5. 30,20,15,10,40 -> 30,40,15,10,20 -> 40,30,15,10,20

	Time taken: n elements, 1 elements -> log(n), n*log(n)

Delete Heap: 40,30,15,10,20
	1. 40,30,15,10,20 -> 20,30,15,10,_ => 30,20,15,10,40
	2. 30,20,15,10,_ -> 10,20,15,_,_ -> 20,10,15,_,_ => 20,10,15,30,40
	3. 20,10,15,_,_ -> 15,10,_,_,_ => 15,10,20,30,40
	4. 15.10,_,_,_ -> 10,_,_,_,_ => 10,15,20,30,40

	Time Taken: n*log(n)

TotalTime: O(n*log(n))
