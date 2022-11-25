def main():
    n=int(input())
    p=2

    printprimes(n,p)

def printprimes(n,p):
    if(p>n):
        return
    isprime=True
    for i in range(2,p):
       
        if(p%i==0):
            isprime = False
            break
    
    if(isprime==True):
        print(p)

    printprimes(n,p+1)

main()

