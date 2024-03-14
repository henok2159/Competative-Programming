class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        henok=False
        
        def backtrack(w,pos,i,j,ss):
            # print(w)
            if w==word:
                nonlocal henok
                henok=True
                
                return
            if len(w)>=len(word):
                
                return
            
            if i>0 and board[i-1][j]==word[pos+1] and (i-1,j) not in ss:
                sss=ss.copy()
                sss.add( (i-1,j))
                backtrack(w+board[i-1][j],pos+1,i-1,j,sss)
                
            if i<len(board)-1 and board[i+1][j]==word[pos+1] and (i+1,j) not in ss:
                sss=ss.copy()
                sss.add( (i+1,j))
                backtrack(w+board[i+1][j],pos+1,i+1,j,sss)
                
            if j>0 and  board[i][j-1]==word[pos+1] and (i,j-1) not in ss:
                sss=ss.copy()
                sss.add((i,j-1))
                backtrack(w+board[i][j-1],pos+1,i,j-1,sss)
                
            if j<len(board[0])-1 and  board[i][j+1]==word[pos+1] and (i,j+1) not in ss:
                sss=ss.copy()
                sss.add((i,j+1))
                backtrack(w+board[i][j+1],pos+1,i,j+1,sss)
                
            
        
        for i in range(len(board)):
            for j in range(len(board[0])):
                
                if henok:
                    return True
                if board[i][j]==word[0]:
                    ss=set()
                    ss.add((i,j))
                    backtrack(word[0],0,i,j,ss)
        return henok