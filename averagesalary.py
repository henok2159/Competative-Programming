class Solution:
    def average(self, salary: List[int]) -> float:
        minval=salary[0]
        maxval=salary[0]
        total=0
        for val in salary:
            total+=val
            maxval=max(maxval,val)
            minval=min(minval,val)
        total=total-minval-maxval
        return total/(len(salary)-2)
