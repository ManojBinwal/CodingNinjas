def main():
    n = int(input())
    p=n
    print("*")
    pattern(n,p)
    dpattern(n-1,p-1)
    print("*")

def pattern(n,p):
    if(n<=0):
        return
    print("*",end="")
    for i in range (1,p-n+2):
        print(i,end="")
    
    if(n<p):
        for i in range(1,p-n+1):
            print(p-n+1-i,end="")
    
    print("*")


    pattern(n-1,p)

def dpattern(n,p):
    if(n<=0):
        return
    print("*",end="")
    for i in range(1,n+1):
        print(i,end="")
    if(n>1):
        for j in range(n-1,0,-1):
            print(j,end="")
    print("*")
    dpattern(n-1,p)

main()