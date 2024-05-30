class Solution:
    def countTriplets(self, arr: List[int]) -> int:
        count = 0
        n = len(arr)
        
        for i in range(n):
            for j in range(i + 1, n):
                a = 0
                for k in range(i, j):
                    a ^= arr[k]
                
                b = 0
                for k in range(j, n):
                    b ^= arr[k]
                    if a == b:
                        count += 1
        
        return count