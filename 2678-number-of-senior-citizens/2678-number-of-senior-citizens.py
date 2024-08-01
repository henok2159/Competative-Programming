class Solution:
    def countSeniors(self, details: List[str]) -> int:
        count=0
        for num in details:
            if int(num[11:13])>60:
                count+=1
        return count
        