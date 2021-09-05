Tree: A representatio of elements(nodes) and their connections with other nodes.

Array representaion of binary tree:

0	   A			  A			 A
     /   \			 / \		/ \
1  	B     C			B   C		B  C
   / \   / \	   / \			  / \
2 D   E F   G	  D	  E			  D  E

A,B,C,D,E,F,G	  A,B,C,D,E		A,B,C,_,_,D,E
Complete Tree		Complete	Full Tree

hight = h => (2^h+1)-1 maximum # of nodes

Tree with maximum number of nodes are called as Full Binary Tree.

For a node at i:
Parent: [i/2]
child: left=(i*2); right=(i*2)+1


Tree -> Full Tree and Complete Tree

Full Tree: A tree when represented by array has one or more empty elements inbetween elements.

Complete Tree: Tree where the array is filled and no Empty elements are present. It is a full binary tree upto hight h-1. Last level elements are filled from left to Right.

Hight of a complete binary tree will be minimun that is log(n).
