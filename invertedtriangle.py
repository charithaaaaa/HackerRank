n = int(input("Enter size: "))

for i in range(n):          # i starts from 0
    for j in range(n):
        if i + j < n:
            print("*", end=" ")
        else:
            print(" ", end=" ")
    print()
