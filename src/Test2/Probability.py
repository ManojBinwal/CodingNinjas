
def main():
    li = input().split(" ")
    n= int(li[0])
    x= int(li[1])
    prob = probability(n,x)
    print(prob)

def probability(n,x):
    Ns = factor(8)/(factor(n)*factor(8-n))
    Ne1= factor(4)/(factor(x)*factor(4-x))
    Ne2= factor(4)/(factor(n-x))*factor(4-(n-x))
    pe=int(((Ne1*Ne2)/Ns)*100)
    return pe

def factor(f):
    fact =1
    for i in range(2,f+1):
        fact*=i
    return fact


main()