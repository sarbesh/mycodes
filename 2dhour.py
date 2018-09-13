#!/bin/python

import math
import os
import random
import re
import sys

# Complete the hourglassSum function below.
def hourglassSum(arr):
    b = []
    a = arr
    for m in range (1,5):
        for n in range (1,5):
            b.append(a[m][n]+a[m-1][n-1]+a[m-1][n]+a[m-1][n+1]+a[m+1][n-1]+a[m+1][n]+a[m+1][n+1])
    return max(b)

if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in xrange(6):
        arr.append(map(int, raw_input().rstrip().split()))
    
    result = hourglassSum(arr)
    print result

    #fptr.write(str(result) + '\n')

    #fptr.close()
