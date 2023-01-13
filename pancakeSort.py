class Solution:
    def swapArr(self,ind:int,arr:List[int]):
        j=0
        print('henok')
        while j<ind:
            temp=arr[j]
            arr[j]=arr[ind]
            arr[ind]=temp
            j+=1
            ind-=1
    
    def pancakeSort(self, arr: List[int]) -> List[int]:
        maxlen=len(arr)
        maxInd=0
        maxval=arr[0]
        sol=[]
        while maxlen>1:
            for i in range(maxlen):
                if arr[i]>maxval:
                    maxval=arr[i]
                    maxInd=i
            print(maxval)
            self.swapArr(maxInd,arr)
            sol.append(maxInd+1)
            self.swapArr(maxlen-1,arr)
            sol.append(maxval)
            maxlen-=1
            maxval=0
        return sol
            
