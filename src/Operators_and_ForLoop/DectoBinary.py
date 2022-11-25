from math import floor


def main():
    n = int(input())
    print(DecToBinary(n))

def DecToBinary(n):
    if(n<=1):
        return n 
    return str(DecToBinary(floor(n/2)))+ str(n%2)

main()