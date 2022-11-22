
def main():
    n = int(input())
    p=1
    pattern(n,p)

def pattern(n,p):
    if(p>=2*n):
        return
    
    for i in range(p,2*n+1,+2):
        print(i,end="")
    k=1
    if(p>1):
        for j in range(1,p,+2):
            print(k,end="")
            k=k+2
    print()

    pattern(n,p+2)

main()