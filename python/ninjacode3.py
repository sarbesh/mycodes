A=raw_input()
B=raw_input()
C=raw_input()
vovels=["a","e","i","o","u"]
for i in range(len(A)):
    if A[i] in vovels:A=A.replace(A[i],'$')
for i in range(len(B)):
    if B[i] not in vovels:B=B.replace(B[i],'#')
for i in range(len(C)):C=C.upper()
print A+B+C
