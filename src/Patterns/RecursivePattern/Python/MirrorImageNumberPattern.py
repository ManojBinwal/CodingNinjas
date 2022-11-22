def main():
    n= int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    if(n==0):
        return
    if(n>1):
        print((" ")*(n-1),end="")
    for i in range(0,p-n+1):
        print(p-p+1+i,end="")
    print()
    pattern(n-1,p)

main()