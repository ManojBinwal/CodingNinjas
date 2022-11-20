li = input().lower().split(' ')
basic = int(li[0])
grade = li[1]
hra = 0.2 * basic
da = 0.5 * basic
pf = 0.11 * basic
total = 0

if grade == 'a':
    allow = 1700
    total = round(basic + hra + da + allow - pf)
elif grade == 'b':
    allow = 1500
    total = round(basic + hra + da + allow - pf)
else:
    allow = 1300
    total = round(basic + hra + da + allow - pf)

print(total)