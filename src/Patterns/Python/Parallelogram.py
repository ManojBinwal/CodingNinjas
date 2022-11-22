n = int(input())
for i in range(0,n):
    if(i>0):
        for j in range(1,i+1):
            print(" ",end="")
    for k in range(0,n):
        print("*",end="")
    print()
