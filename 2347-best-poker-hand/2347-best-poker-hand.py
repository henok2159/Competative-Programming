class Solution:
    def bestHand(self, ranks: List[int], suits: List[str]) -> str:
        suitMap={}
        for suit in suits:
            suitMap[suit]=suitMap.get(suit,0)+1
        for kk in suitMap.keys():
            if suitMap[kk]>=5:
                return "Flush"
        rankMap={}
        for rank in ranks:
            rankMap[rank]=rankMap.get(rank,0)+1
        mx=0
        for kk in rankMap.keys():
            mx=max(mx,rankMap[kk])
        if mx>=3:
            return "Three of a Kind"
        if mx==2:
            return "Pair"
        return "High Card"