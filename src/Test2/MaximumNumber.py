S = input().strip()
max=0
for i in  range(0,len(S)):
    temp=""
    ListS = list(S)
    ListS.pop(i)
    temp = "".join(ListS)
    temp.strip()
    temp=int(temp)
    if(temp>max):
        max=temp
print(max)
