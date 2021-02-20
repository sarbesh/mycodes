def main() :
	a,b = input().split(" ")
	x = int(a)
	y = float(b)
	z=0.50
	if (x%5==0 and x<=y-z) :
		p = y-z-x
		print("%.2f" % p)
	else:
		print("%.2f" % y)

if __name__ == '__main__':
	main()