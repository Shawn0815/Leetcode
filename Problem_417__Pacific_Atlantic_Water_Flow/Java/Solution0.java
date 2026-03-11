package Problem_417__Pacific_Atlantic_Water_Flow.Java;

import java.util.ArrayList;
import java.util.List;

public class Solution0 {
    
    int rowN = 0;
    int colN = 0;

    Boolean[][] pac;
    Boolean[][] atl;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> resultList = new ArrayList<>();

        rowN = heights.length;
        colN = heights[0].length;

        pac = new Boolean[rowN][colN];
        atl = new Boolean[rowN][colN];

        for (int i = 0; i < rowN; i++) {

            for (int j = 0; j < colN; j++) {

                boolean[][] visited = new boolean[rowN][colN];
                
                if (dfsPac(heights, i, j, visited) && dfsAtl(heights, i, j, visited)) {
                    resultList.add(List.of(i, j));
                }
            }
        }

        return resultList;
    }

    private boolean dfsPac(int[][] heights, int i, int j, boolean visited[][]) {

        if ((i < 0 || i >= rowN) || (j < 0 || j >= colN)) {
            return false;
        }

        if ((i == 0) || (j == 0)) {
            return true;
        }

        if (pac[i][j] != null) {
            return pac[i][j];
        }

        if (visited[i][j] == true) {
            return false;
        }

        visited[i][j] = true;

        boolean up = (i - 1 >= 0) && heights[i][j] >= heights[i - 1][j] && dfsPac(heights, i - 1, j, visited);
        boolean down = (i + 1 < rowN) && heights[i][j] >= heights[i + 1][j] && dfsPac(heights, i + 1, j, visited);
        boolean left = (j - 1 >= 0) && heights[i][j] >= heights[i][j - 1] && dfsPac(heights, i, j - 1, visited);
        boolean right = (j + 1 < colN) && heights[i][j] >= heights[i][j + 1] && dfsPac(heights, i, j + 1, visited);
    
        pac[i][j] = up || down || left || right;

        visited[i][j] = false;

        return pac[i][j];
    }

    private boolean dfsAtl(int[][] heights, int i, int j, boolean visited[][]) {

        if ((i < 0 || i >= rowN) || (j < 0 || j >= colN)) {
            return false;
        }

        if ((i == rowN - 1) || (j == colN - 1)) {
            return true;
        }

        if (visited[i][j] == true) {
            return false;
        }

        if (atl[i][j] != null) {
            return atl[i][j];
        }

        visited[i][j] = true;

        boolean up = (i - 1 >= 0) && heights[i][j] >= heights[i - 1][j] && dfsAtl(heights, i - 1, j, visited);
        boolean down = (i + 1 < rowN) && heights[i][j] >= heights[i + 1][j] && dfsAtl(heights, i + 1, j, visited);
        boolean left = (j - 1 >= 0) && heights[i][j] >= heights[i][j - 1] && dfsAtl(heights, i, j - 1, visited);
        boolean right = (j + 1 < colN) && heights[i][j] >= heights[i][j + 1] && dfsAtl(heights, i, j + 1, visited);

        visited[i][j] = false;

        atl[i][j] = up || down || left || right;

        return atl[i][j];
    }
}
