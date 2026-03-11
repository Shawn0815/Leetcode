package Problem_200__Number_of_Islands.Java;

public class Solution1 {
    
    int rowN = 0;
    int colN = 0;
    
    public int numIslands(char[][] grid) {
        
        int count = 0;
        rowN = grid.length;
        colN = grid[0].length;
        
        // 一格一格掃描，查看是否為陸地
        for (int i = 0; i < rowN; i++) {

            for (int j = 0; j < colN; j++) {

                // 如果是陸地，島嶼數 + 1
                // 並遞迴處理相鄰所有格子
                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    // dfs 函數用來對每一格做標記並遞迴處理相鄰格子
    private void dfs(char[][] grid, int i, int j) {

        // 若格子超出邊界或是海洋，直接結束，不需要再遞迴
        if ((i < 0 || i >= rowN) || (j < 0 || j >= colN) || grid[i][j] == '0') {
            return;
        }

        // 否則標記為 0，代表已走訪
        grid[i][j] = '0';

        // 接著遞迴處理上下左右相鄰格子
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}
