def main():
    n = int(input())
    p=0
    binaryToDecimal(n,p)

dec = 0
def binaryToDecimal(n,p):
    global dec
    if(n==0):
        print(dec)
        return
    
    dec = dec + n%10 * pow(2,p)
    binaryToDecimal(round(n/10),p+1)
    
main()
   
    
