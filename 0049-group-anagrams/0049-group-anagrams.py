class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        hm=defaultdict(list) 
        for word in strs:
            sort_word=list(word)
            sort_word.sort()
            sw=''.join(sort_word)
            hm[sw].append(word)
        sol=[]
        for kk in hm.keys():
            sol.append(hm[kk])
        return sol
            
            
        