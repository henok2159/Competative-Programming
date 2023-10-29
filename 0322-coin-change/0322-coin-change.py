class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp=[amount+1]*(amount+1)
        dp[0]=0
        for i in range(1,amount+1):
            for c in coins:
                ned=i-c
                if ned>=0:
                    dp[i]=min(dp[i],1+dp[ned])
        if dp[amount]>amount:
            return -1
        return dp[amount]