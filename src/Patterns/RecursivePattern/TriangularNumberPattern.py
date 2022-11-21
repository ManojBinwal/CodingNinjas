def main():
    n = int(input())
    p=n
    triangularNumberPattern(n,p)

def triangularNumberPattern(n,p):
    if(n==0):
        exit()
    print(str(p-n+1)*(p-n+1))
    triangularNumberPattern(n-1,p)

main()