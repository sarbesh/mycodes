#!/bin/python

import math
import os
import random
import re
import sys
import time

# Complete the rotLeft function below.
def rotLeft(a, d):
    return a[d:]+a[:d]
    #print len(a)
    #for i in range(d):
    #    temp=a[0]
    #    for m in range(len(a)-1):
    #        a[m]=a[m+1]
            #print a[m]
    #    a[len(a)-1]=temp
    #return a

        

if __name__ == '__main__':
    #fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nd = raw_input().split()

    n = int(nd[0])

    d = int(nd[1])

    a = map(int, raw_input().rstrip().split())

    start = time.time()
    result = rotLeft(a, d)
    end= time.time()
    print result
    print end-start

    #fptr.write(' '.join(map(str, result)))
    #fptr.write('\n')

    #fptr.close()
