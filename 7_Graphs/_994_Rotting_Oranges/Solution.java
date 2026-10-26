package _994_Rotting_Oranges;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    Queue<int[]> queue = new LinkedList<>();
    int fresh;
    int rowN, colN = 0;
    
    public int orangesRotting(int[][] grid) {
        rowN = grid.length;
        colN = grid[0].length;

        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                else if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int minutes = 0;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int curFresh = fresh;

            for (int i = 0; i < levelSize; i++) {
                int[] current = queue.poll();
                int r = current[0], c = current[1];

                bfs(r - 1, c, grid);
                bfs(r + 1, c, grid);
                bfs(r, c - 1, grid);
                bfs(r, c + 1, grid);
            }

            if (fresh < curFresh) {
                minutes++;
            }
        }

        return fresh == 0 ? minutes : -1;
    }

    public void bfs(int r, int c, int[][] grid) {
        if ((r < 0) || (r >= rowN) || (c < 0) || (c >= colN)) {
            return;
        }

        if (grid[r][c] != 1) {
            return;
        }

        grid[r][c] = 2;
        queue.offer(new int[] {r, c});
        fresh--;
    }
}
