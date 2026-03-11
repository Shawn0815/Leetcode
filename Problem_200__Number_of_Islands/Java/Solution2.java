package Problem_200__Number_of_Islands.Java;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    int rowN = 0;
    int colN = 0;
    
    public int numIslands(char[][] grid) {

        rowN = grid.length;
        colN = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int count = 0;

        // 遍歷每一格檢查是否為陸地
        for (int i = 0; i < rowN; i++) {

            for (int j = 0; j < colN; j++) {

                // 若是陸地，標記為已走訪
                // 接著將它塞進 queue 中，提醒等等要來處理它的鄰居
                if (grid[i][j] == '1') {

                    grid[i][j] = '0';
                    queue.add(new int[] {i, j});
                    count++;
                    
                    // 如果 queue 中有東西，代表有格子有鄰居要處理
                    while (!queue.isEmpty()) {
                        
                        // 將這格的座標取出
                        int[] node = queue.poll();
                        int r = node[0];
                        int c = node[1];

                        int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

                        // 遍歷四個方向，計算需要處理的鄰居座標
                        for (int[] dir: directions) {

                            int nr = r + dir[0];
                            int nc = c + dir[1];

                            // 如果鄰居座標合法且也是陸地
                            // 同樣也將它做標記，並依序放入 queue，等等要處理這個鄰居的鄰居
                            if ((nr >= 0 && nr < rowN) && (nc >= 0 && nc < colN) && grid[nr][nc] == '1') {
                                grid[nr][nc] = '0';
                                queue.add(new int[] {nr, nc});
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
