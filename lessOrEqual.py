nk=input()
nk=[int(x) for x in nk.split()]
n=nk[0]
k=nk[1]
arr=input()
a=[int(x) for x in arr.split()]
a.sort()
if k==0:
    if a[0]==1:
        print(-1)
    else:
        print(1)
else:
    if n==k:
        print(a[k-1])
    elif a[k]==a[k-1]:
        print(-1)
    else:
        print(a[k-1])
