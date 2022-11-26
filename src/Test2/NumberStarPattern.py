n = int(input())
for i in range(0,n):
    for j in range(1,n+1):
        if(j>n-i):
            print("*",end="")
        else:
            print(j,end="")
    for k in range(1,n+1):
        if(n+1-k>n-i):
            print("*",end="")
        else:
            print(n+1-k,end="")
    print()