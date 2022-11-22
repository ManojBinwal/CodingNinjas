def main():
    n = int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    if(n<=0):
        return
    
    if(n<p):
        print(" "*(p-n),end="")
    print("*"*p)

    pattern(n-1,p)

main()