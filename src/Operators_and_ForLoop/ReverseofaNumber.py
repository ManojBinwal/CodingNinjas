n = int(input())

if(n<10):
    print(n)
    exit()
while(n%10==0):
    n=round(n/10)

n=str(n)
n=n[::-1]
print(n)