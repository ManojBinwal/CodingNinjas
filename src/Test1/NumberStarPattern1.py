n=int(input())
for i in range(0,n):
    for j in range(0,n-i):
        if(n-j !=i+1):
            print(n-j,end="")
        else:
            print("*",end="")
    
    if(i>0):
        for k in range(0,i):
            print(i-k,end="")
    print()