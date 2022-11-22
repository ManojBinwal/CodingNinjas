def main():
    n = int(input())
    p=n
    squarePattern(n,p)

def squarePattern(n,p):
    if(n==0):
        exit()
    print(str(p)*p)
    squarePattern(n-1,p)

main()