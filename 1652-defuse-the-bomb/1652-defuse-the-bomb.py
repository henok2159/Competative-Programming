class Solution:
    def decrypt(self, code: List[int], k: int) -> List[int]:
        arr=[]
        for i in range(len(code)):
            counter=abs(k)
            sol=0
            for j in range(1,counter+1):
                if(k<0):
                    ind=i-j
                else:
                    ind=i+j
                # print(ind)
                if(ind<0):
                    sol+=code[ind]
                else:
                    sol+=code[ind%len(code)]
            arr.append(sol)
        return arr
        