class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        profit=0
        mn=prices[0]
        for price in prices:
            if mn<price:
                profit+=price-mn
            mn=price
        return profit
            
                
            
        