n = int(input())
for i in range (1,n*2,+2):
    for j in range(i,n*2,+2):
        print(j,end="")
    if(i>=1):
        for k in range(1,i-1,+2):
            print(k,end="")
    print()