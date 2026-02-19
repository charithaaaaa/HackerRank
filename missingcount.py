N = int(input())
arr = list(map(int, input().split()))

total = N*(N+1)//2   

sum_1 = 0          
for i in range(len(arr)):
    sum_1 = sum_1 + arr[i]

print(total - sum_1)
