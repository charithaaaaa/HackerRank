a=[0,10,4,0,3]
l=0
for right in range(len(a)):
    if a[right]!=0:
        a[l],a[right]=a[right],a[l]
        l+=1
print(a)
