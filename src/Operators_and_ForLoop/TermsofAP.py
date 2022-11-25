def main():
    n = int(input())
    p=1
    AProgression(n,p)
count = 0
def AProgression(n,p):
    global count
    if(p>n+count):
        return
    if((3*p + 2)%4 != 0):
        print(3*p + 2,end=" ")
    else:
        count=count+1
    AProgression(n,p+1)

main()