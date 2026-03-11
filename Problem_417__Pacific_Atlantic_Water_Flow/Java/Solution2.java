package Problem_417__Pacific_Atlantic_Water_Flow.Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {

    private int rowN;
    private int colN;
    private int[][] directions = new int[][] {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    // 主函式：遍歷每一格判斷是否加入 List
    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        rowN = heights.length;
        colN = heights[0].length;

        // 用二維陣列紀錄每一格是否屬於 "太平洋或大西洋區域"
        boolean[][] pac = new boolean[rowN][colN];
        boolean[][] atl = new boolean[rowN][colN];

        // 用 queue 紀錄等等需要擴散處理鄰居的格子
        Queue<int[]> pacQueue = new LinkedList<>();
        Queue<int[]> atlQueue = new LinkedList<>();

        // 將左側邊界往內標記為 "太平洋區域"，並加入 queue
        // 將右側邊界往內標記為 "大西洋區域"，並加入 queue
        for (int r = 0; r < rowN; r++) {
            pac[r][0] = true;
            pacQueue.offer(new int[] {r, 0});

            atl[r][colN - 1] = true;
            atlQueue.offer(new int[] {r, colN - 1});
        }

        // 將上側邊界往內標記為 "太平洋區域"，並加入 queue
        // 將下側邊界往內標記為 "大西洋區域"，並加入 queue
        for (int c = 0; c < colN; c++) {
            pac[0][c] = true;
            pacQueue.offer(new int[] {0, c});

            atl[rowN - 1][c] = true;
            atlQueue.offer(new int[] {rowN - 1, c});
        }

        // 分別呼叫 BFS 函式將 queue 中格子擴散標記太平洋與大西洋區域
        bfs(heights, pac, pacQueue);
        bfs(heights, atl, atlQueue);

        List<List<Integer>> result = new ArrayList<>();

        // 每一格標記過後，依序遍歷找出同為 "太平洋與大西洋區域" 的格子
        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                if (pac[i][j] && atl[i][j]) {
                    result.add(List.of(i, j));
                }
            }
        }

        return result;
    }

    // BFS 函式：依序擴散處理每一格的鄰居，並做標記
    private void bfs(int[][] heights, boolean[][] ocean, Queue<int[]> queue) {

        // 若 queue 非空，代表還有格子需要擴散處理
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int r = node[0];
            int c = node[1];

            // 往每個方向的鄰居做標記
            for (int[] dir: directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                // 若鄰居座標合法且未標記過且能夠走到這格（高度大於等於這格）
                // 將鄰居座標記，並加入 queue，未來需要擴散處理這格的鄰居
                if (nr >= 0 && nr < rowN && nc >= 0 && nc < colN &&
                    (!ocean[nr][nc]) && heights[nr][nc] >= heights[r][c]) {
                    ocean[nr][nc] = true;
                    queue.offer(new int[] {nr, nc});
                }
            }
        }
    }
}
