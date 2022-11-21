def main():
    n = int(input())
    p=n
    triangularStar(n,p)

def triangularStar(n,p):
    if(n==0):
        exit()
    print("*"*(p-n+1))
    triangularStar(n-1,p)

main()