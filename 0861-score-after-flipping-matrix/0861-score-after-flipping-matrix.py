class Solution:
    def matrixScore(self, grid: List[List[int]]) -> int:
        nRows, nCols = len(grid), len(grid[0])

        def flipRow(row):
            for col in range(nCols):
                grid[row][col] = 1 - grid[row][col] 

        def flipCol(col):
            for row in range(nRows):
                grid[row][col] = 1 - grid[row][col]

        def checkRow(nums):
            return int(''.join([str(num) for num in nums]), 2)
        for row in range(nRows):
            if grid[row][0] == 0:
                flipRow(row)
        for col in range(1, nCols):
            if sum(grid[r][col] for r in range(nRows)) * 2 < nRows:
                flipCol(col)
        return sum(checkRow(row) for row in grid)
        