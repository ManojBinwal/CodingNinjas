def main():
    n = int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    if(n==0):
        return
    print(" " * (n-1),end="")

    for i in range(0,p-n+1):
        print((p-n+1)+i,end="")

    if(n<p):
        for j in range(0,p-n-1+1):
            print((2*(p-n+1)-2)-j,end="")
    print() 
    pattern(n-1,p)

main()