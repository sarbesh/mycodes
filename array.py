#!/bin/python

import math
import os
import random
import re
import sys

# Complete the reverseArray function below.
def reverseArray(a):
    b = a[len(a)-1::-1]
    return b

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(raw_input())

    arr = map(int, raw_input().rstrip().split())

    res = reverseArray(arr)

    fptr.write(' '.join(map(str, res)))
    fptr.write('\n')

    fptr.close()
