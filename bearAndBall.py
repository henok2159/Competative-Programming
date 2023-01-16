z=input()
n=input()
n=n.split(' ')
n=[int(x) for x in n]
res = []
for i in n:
    if i not in res:
        res.append(i)
res.sort()
i=2
doesHave=False

while i<len(res):
     if res[i]-res[i-1]==1 and res[i]-res[i-2]==2:
          doesHave=True
          break
     i+=1
if doesHave:
     print('YES')
else:
     print('NO')
