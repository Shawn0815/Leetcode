package Problem_74__Search_a_2D_Matrix.Java;

public class Solution5 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowN = matrix.length;
        int colN = matrix[0].length;

        // 從矩陣右上角開始搜索
        int row = 0;
        int col = colN - 1;

        // 重複比較 target 跟 matrix[row][col] 直到走到底
        while ((row < rowN) && (col >= 0)) {
            if (target == matrix[row][col]) {
                return true;
            }

            // 若 target > matrix[row][col] => 往下找
            if (target > matrix[row][col]) {
                row++;
            }
            // 若 target < matrix[row][col] => 往左找
            else {
                col--;
            }
        }

        return false;
    }
}
