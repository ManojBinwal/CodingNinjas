n = int(input())
s='A'
for i in range (0,n):
    for j in range(0,i+1):
        print(chr(ord(s)+i+j),end="")
    print()