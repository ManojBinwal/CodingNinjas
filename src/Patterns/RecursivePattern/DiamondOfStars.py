from decimal import ROUND_FLOOR

c=1
def main():
    n = int(input())
    p=n
    pattern(n,p)
    dpattern(n-2,p-2)

def pattern(n,p):
    if(n<=0):
        return
    print(" " * round(((2*n)/2-1)/2) ,end="")
    print("*" * (p-n+1))
    pattern(n-2,p)

def dpattern(n,p):
    if(n<=0):
        return
    global c
    if(n>=1):
        print(" " * (c),end="")
        c=c+1
    print("*" * (n))
    dpattern(n-2,p)

main()