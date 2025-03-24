class Solution:
    def countDays(self, days: int, meetings: List[List[int]]) -> int:
        count=0
        meetings.sort(key=lambda x: x[0])
        print(meetings)
        count+=meetings[0][0]-1
        for i in range(len(meetings)-1):
            if meetings[i][1]<meetings[i+1][0]:
                count+=meetings[i+1][0]-meetings[i][1]-1
            if meetings[i][1]>meetings[i+1][1]:
                meetings[i+1]=meetings[i]
        count += days-meetings[len(meetings)-1][1]
        return count



        