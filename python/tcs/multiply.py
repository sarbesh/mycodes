inp = input()
inp = inp.replace(' ','')
res = 1
for i in inp:
	res = res * int(i)
print(res)
