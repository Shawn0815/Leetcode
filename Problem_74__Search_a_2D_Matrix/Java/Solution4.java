package Problem_74__Search_a_2D_Matrix.Java;

public class Solution4 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowN = matrix.length;
        int colN = matrix[0].length;

        // 初始化 left, right：把二維矩陣想成一維陣列
        int left = 0, right = rowN * colN - 1;

        // 用一維陣列做 Binary Search
        while (left <= right) {
            // 計算一維陣列的 middle index
            int middle = (left + right) / 2;
            
            // 從 middle index 回推對應的二維矩陣 row, col
            int row = middle / colN;
            int col = middle % colN;

            // 比較 target 跟 matrix[row][col] 做 Binary Search
            if (target == matrix[row][col]) {
                return true;
            }

            if (target < matrix[row][col]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }

        return false;
    }
}
