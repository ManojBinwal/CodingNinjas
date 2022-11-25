n = int(input())
print("2")
for i in range(3,n+1,+2):
    isprime=True
    for j in range(2,i):
        if(i%j==0):
            isprime=False
            break
    if (isprime==True):
        print(i)
    
