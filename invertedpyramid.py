n = 5

for i in range(n):
    # spaces
    for j in range(i):
        print(" ", end="")
        
    # stars
    for k in range(n - i):
        print("* ", end="")
        
    print()