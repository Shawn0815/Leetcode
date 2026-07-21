package _200_Number_of_Islands;

public class Solution {
    int rowN, colN;

    public int numIslands(char[][] grid) {
        rowN = grid.length;
        colN = grid[0].length;

        int count = 0;

        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    dfs(i, j, grid);
                }
            }
        }

        return count;
    }

    public void dfs(int r, int c, char[][] grid) {
        if ((r < 0) || (r >= rowN) || (c < 0) || (c >= colN)) {
            return;
        }

        if (grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        dfs(r + 1, c, grid);
        dfs(r + 1, c, grid);
        dfs(r, c + 1, grid);
        dfs(r, c - 1, grid);
    }
}
