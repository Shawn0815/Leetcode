package Problem_417__Pacific_Atlantic_Water_Flow.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

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

        // 針對左側邊界往內標記為 "太平洋區域"
        // 針對右側邊界往內標記為 "大西洋區域"
        for (int r = 0; r < rowN; r++) {
            dfs(heights, r, 0, pac);
            dfs(heights, r, colN - 1, atl);
        }

        // 針對上側邊界往內標記為 "太平洋區域"
        // 針對下側邊界往內標記為 "大西洋區域"
        for (int c = 0; c < colN; c++) {
            dfs(heights, 0, c, pac);
            dfs(heights, rowN- 1, c, atl);
        }

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

    // DFS 函式：針對每一格遞迴走訪鄰居做標記
    private void dfs(int[][] heights, int i, int j, boolean[][] ocean) {
        
        // 若已標記，跳過
        if (ocean[i][j]) {
            return;
        }

        // 做標記
        ocean[i][j] = true;

        // 遍歷每個方向的鄰居遞迴做標記
        for (int[] dir : directions) {
            int nr = i + dir[0];
            int nc = j + dir[1];

            // 若鄰居座標合法且未標記過且能夠走到這格（高度大於等於這格）
            // 遞迴進去做標記
            if (nr >= 0 && nr < rowN && nc >= 0 && nc < colN &&
                (!ocean[nr][nc]) && heights[nr][nc] >= heights[i][j]) {
                dfs(heights, nr, nc, ocean);
            }
        }
    }
}
