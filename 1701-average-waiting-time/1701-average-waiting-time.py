class Solution:
    def averageWaitingTime(self, customers: List[List[int]]) -> float:

        totalTime=0
        totalWaiting=0
        for customer in customers:

            if totalWaiting>customer[0]:
                totalTime+=totalWaiting-customer[0]+customer[1]
                totalWaiting+=customer[1]
            else:
                totalWaiting=customer[0]+customer[1]
                totalTime+=customer[1]
        return totalTime/len(customers)

    
        