import java.util.LinkedList;
import java.util.Queue;

public class Solution1 {
    
    public int orangesRotting(int[][] grid) {
        
        int rowN = grid.length;
        int colN = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;      // 新鮮橘子數量
        int minutes = 0;    // 花費的分鐘數

        // 初始化：
        // 1. 統計新鮮橘子數量
        // 2. 將腐爛橘子加入 queue 中，等待擴散
        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS：只要還有新鮮橘子且 queue 中還有腐爛橘子等待擴散，就繼續
        while (fresh > 0 && !queue.isEmpty()) {
            
            // 這一層要處理的腐爛橘子各數（同一分鐘）
            int levelSize = queue.size();

            // 擴散處理同一層所有腐爛橘子（一層代表一分鐘）
            for (int i = 0; i < levelSize; i++) {
                int[] pos = queue.poll();
                
                // 往上下左右鄰居腐爛擴散
                for (int[] dir: directions) {
                    int nr = pos[0] + dir[0];
                    int nc = pos[1] + dir[1];

                    // 如果鄰居座標不合法，跳過
                    if (nr < 0 || nr >= rowN || nc < 0 || nc >= colN) {
                        continue;
                    }

                    // 如果鄰居是新鮮橘子，標記為腐爛（新鮮橘子數減一）
                    // 並加入 queue 等待擴散
                    if (grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;
                        queue.offer(new int[] {nr, nc});
                        fresh--;
                    }
                }
            }

            // 處理完這一層，代表過了一分鐘
            minutes++;
        }

        // 最後如果還有新鮮橘子，代表永遠擴散不完，回傳 -1
        // 否則，所有橘子皆腐爛完必，回傳花的分鐘數
        return fresh == 0 ? minutes : -1;
    }
}