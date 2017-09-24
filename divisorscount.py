a = raw_input("Enter the starting value:")
b = raw_input("Enter the finishing last value: ")
count = 0
sum = 0
for i in range (a, b):
    for x in range (1, i):
        if (i%x == 0):
            count = count + 1
            sum = sum + 1
print count
print sum
