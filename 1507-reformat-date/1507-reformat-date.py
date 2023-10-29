class Solution:
    def reformatDate(self, date: str) -> str:
        month=["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
        d,m,y=date.split()
        mn=0
        for i in range(len(month)):
            if month[i]==m:
                mn=i+1
                break
        mx=str(mn)
        if mn<10:
            mx='0'+str(mn)
        dy=''
        for c in d:
            if c.isdigit():
                dy=dy+c
        dx=dy
        if len(dy)==1:
            dx='0'+dy
        return y+'-'+mx+'-'+dx

            
                
        