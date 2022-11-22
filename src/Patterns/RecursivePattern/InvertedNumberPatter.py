def main():
    n = int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    if(n==0):
        return 0 
    print(str(n)*n)
    pattern(n-1,p)

main()