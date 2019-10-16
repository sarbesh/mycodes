#!/bin/python

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(grid):

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(raw_input().strip())

    for t_itr in xrange(t):
        points = []

        for _ in xrange(5):
            points.append(map(int, raw_input().rstrip().split()))

        result = solve(points)

        fptr.write(result + '\n')

    fptr.close()
