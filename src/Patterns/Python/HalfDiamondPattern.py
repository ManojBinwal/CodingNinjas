n = int(input())
print("*")
for i in range(1,n+1):
    print("*",end="")
    for j in range(1,i+1):
        print(j,end="")
    
    if(i>1):
        for k in range(1,i):
            print(i-k,end="")
    print("*",end="")
    print()
i=0 
j=0
k=0

for i in range(1,n):
    print("*",end="")
    for j in range(1,n-i+1):
        print(j,end="")

    for k in range(n-1-i,0,-1):
        print(k,end="")
    print("*",end="")
    print()
print("*",end="")
