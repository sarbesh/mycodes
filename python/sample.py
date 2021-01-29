#!/bin/python

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(grid):
    a=[]
    b=[]
    for i in xrange(5):
        if grid[i][0] in a:
            #c.append(grid[i][0])
            p=grid[i][0]
            break
        else:
            a.append(grid[i][0])
    for i in xrange(5):
        if grid[i][1] in b:
            #c.append(grid[i][1])
            q=grid[i][1]
            break
        else:
            b.append(grid[i][1])
    print [p,q]
    if [p-1,q] and [p+1,q] in grid:
        if ([p,q+1] and [p,q+2]) or ([p,q-1] and [p,q-2]) in grid :
            print "YES"
        else:
            print "NO"
    elif [p,q-1] and [p,q+1] in grid:
        if ([p+1,q] and [p+2,q]) or ([p-1,q] and [p-2,q]) in grid :
            print "yes"
        else:
            "no"
    else:
        print "No"

def main():
    t = int(raw_input().strip())
    for t_itr in xrange(t):
        points = []
        for _ in xrange(5):
            points.append(map(int, raw_input().rstrip().split()))
        print points
        result = solve(points)

if __name__ == '__main__':
    main()
