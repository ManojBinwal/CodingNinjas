n=int(input())
lst = input().strip().split(" ")
for i in range(0,len(lst)):
    lst[i]=int(lst[i])
print(lst)
diff = lst[1] - lst[0]
isAp="true"
for i in range(0,len(lst)-1):
    if(lst[i+1]-lst[i] != diff):
        isAp="false"
        break
    else:
        isAp="true"
print(isAp)

