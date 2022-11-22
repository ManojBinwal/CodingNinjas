n = int(input())
for i in range(1,n+1):
    sum = 0
    for j in range(1,i+1):
        if(j>1):
            print("+",end="")
        print(j,end="")
        sum = sum + j
    print("=",sum,sep="")