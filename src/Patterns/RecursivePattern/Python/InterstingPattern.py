def main():
    n = int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    s = 'A'
    if(n==0):
        return
    for i in range(0,p-n+1):
        print(chr(ord(s)+(n-1+i)),end="")
    print()
    pattern(n-1,p)
main()
   