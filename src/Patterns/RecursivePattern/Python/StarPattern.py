def main():
    n = int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    if(n==0):
        return
    print(" " * (n-1),end="")
    print("*" * (2*(p-n+1)-1))
    pattern(n-1,p)

main()