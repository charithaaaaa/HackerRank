s="java is powerful language"
a=s.split(  )
temp=len(a[0])
for i in a:
    if temp<len(i):
        temp=len(i)
        word=i
print(word)