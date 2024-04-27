class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        for i in range(len(board)):
            ss=set()
            for j in range(9):
                if board[i][j] in ss:
                    return False
                if board[i][j].isdigit():
                    ss.add(board[i][j])
        
        for i in range(len(board)):
            ss=set()
            for j in range(9):
                if board[j][i] in ss:
                      return False
                if board[j][i].isdigit():
                    ss.add(board[j][i])
        
        for i in range(9):
            for j in range(9):
                if i%3==0 and j%3==0:
                    ss=set()
                    for k in range(i,i+3):
                        for l in range(j,j+3):
                            if board[k][l] in ss:
                                return False
                            if board[k][l].isdigit():
                                ss.add(board[k][l])
        return True
            