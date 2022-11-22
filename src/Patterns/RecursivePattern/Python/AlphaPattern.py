def main():
    n = int(input())
    p=n
    pattern(n,p)

def pattern(n,p):
    s = 'A'
    if(n==0):
        return
    print(chr(ord(s)+(p-n))*(p-n+1))
    pattern(n-1,p)

main()