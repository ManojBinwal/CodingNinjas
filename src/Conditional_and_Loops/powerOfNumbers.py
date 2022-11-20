li = input().split(" ")
num = int(li[0])
pow = int(li[1])
ans = 1
if(pow == 0):
    print("1")
    exit()

for i in range (0,pow):
    ans = ans * num
print(ans)
