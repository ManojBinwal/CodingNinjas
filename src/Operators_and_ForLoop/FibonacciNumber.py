def main():
    n = int(input())
    fib = fibonacci(n)
    print(fib)

def fibonacci(n):
    if(n<=1):
        return n
    
    return fibonacci(n-1) + fibonacci(n-2)

main()