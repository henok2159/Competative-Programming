n=int(input())
while n>0:
    n-=1
    leng=int(input())
    it=input()
    it=it.split()
    arr=[int(x) for x in it ]
    arr.sort()
    canMake=True
    for i in range(len(arr)-1):
        if arr[i+1]-arr[i]==1 or arr[i+1]==arr[i]:
            continue
        else:
            canMake=False
    if canMake:
        print('YES')
    else:
        print('NO')
