def main():
    n = int(input())
    p=n
    reverse(n,p)

def reverse(n,p):
    if(n==0):
        return
    for i in range(1,p-n+2):
        print((p-n+1)-i+1,end="")
    print()
    reverse(n-1,p)

main()