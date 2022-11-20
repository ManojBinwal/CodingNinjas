digit = int(input())
odd = 0
even = 0
while(digit!=0):
    rem = digit%10
    if rem%2 == 1:
        odd = odd + rem
    else:
        even = even + rem
print(f"{even} {odd}")