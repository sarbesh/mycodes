#!/bin/python

from __future__ import print_function

import os
import random
import sys


#
# Complete the getTotalX function below.
#
def getTotalX(a, b):
    n= len(a) 
    m=len(b)
    c= max(a)
    d= min(b)
    C=[]
    for i in range(c,d):
        

if __name__ == '__main__':
    f = open(os.environ['OUTPUT_PATH'], 'w')

    nm = raw_input().split()

    n = int(nm[0])

    m = int(nm[1])

    a = map(int, raw_input().rstrip().split())

    b = map(int, raw_input().rstrip().split())

    total = getTotalX(a, b)

    f.write(str(total) + '\n')

    f.close()
