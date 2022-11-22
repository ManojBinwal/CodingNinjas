def main():
    n = int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    if(n<=0):
        return
    sum=0
    for i in range(1,p-n+2):
        print(i,end="")
        if(i<p-n+1):
            print("+",end="")
        sum = sum + i
    print("=",sum,sep="")

    pattern(n-1,p)


main()