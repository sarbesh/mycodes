Heap:	Complete Binay tree & Every Element is either greater(MinHeap) or smaller(MaxHeap) than it's parent node. Duplicates are allowed as child.

		MaxHeap				  MinHeap

		  50					 10
	    /	 \				   /    \
	  30	  20			 30		 20  
	 /  \    /  \			/  \  	/  \
   15	 10 8    16		  35   40 32	25

  50,30,20,15,10,8,16 	10,30,20,35,40,32,25

Insert Ops in Max Heap:
  H 50,30,20,15,10,8,16
	Insert: 60
	Do not insert at root. Insert at Array end and check with parent node. and replace if required.
	1. Insert at end of array	50 30 20 15 10 8 16 60				  60
	2. Comapre with parent (i/2): 									/	 \
		a. 60>15 -> replace 50 30 20 60 10 8 16 15				   50	 20
		b. 60>30 -> replace	50 60 20 30 10 8 16 15				  /	 \	/  \
		c. 60>50 -> replace 60 50 20 30 10 8 16 15				30	 10 8	16
	3. Time Taken = Number of swaps, depends on h O(log n)		/
	4. minimum O(1) when small value						   15

Delete OPS in MaxHeap:
	Only Root node is allowed to delete
	H	50.30,20,15,10,8,16
	Remove element
	1. _,30,20,15,10,8,16
	2. Bring last element in place of removed element
		16,30,20,15,10,8,_
	3. Compare child of 16(i:e: 30,20) compare 16 with max(30,20) since small swap with the greater value i:e 30 => 30,16,20,15,10,8
	4. Comapre chile of 16 (i:e 15,10) compare 16 with max(15,10) if small then swap
	5. Time: log(n) 
	
	After deleting the element the heap size is reduced buy 1, there will a free space at the end of the heap, place the deleted element at the end, This will not be part of heap.

	On further deletion the Heap will be reduced and when heap.len =1 the the array is sorted. This is HeapSort.


Heapify:
Procees of creating a heap; Look downwards	//C-> Compare, 
1. 10,20,15,12,40,25,18
2. Start from end and check for chile nodes
3. No child nodes untill node 15
4. Node 15 -> C(15,MAX(25,18)) and swap. => 10,20,25,12,40,15,18
5. Node 20 -> C(20, MAX(12,40)) -> swap => 10,40,25,12,20,15,18
6. Node 10 -> C(10, MAX(40,25)) -> swap(10,45) -> C(10,MAX(20,15)) -> swap(20,10) => 40,20,25,12,10,15,18

Time Taken: O(n)
