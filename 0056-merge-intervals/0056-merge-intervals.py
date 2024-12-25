class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        
        intervals.sort(key=lambda x:x[0])
        arr=[intervals[0]]
        for interval in intervals:
            if arr[len(arr)-1][1]>=interval[0]:
                arr[len(arr)-1][1]=max(arr[len(arr)-1][1],interval[1])
            else:
                arr.append(interval)
        return arr
        