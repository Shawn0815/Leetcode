package Problem_74__Search_a_2D_Matrix.Java;

public class Solution1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowN = matrix.length;
        int colN = matrix[0].length;

        // 雙層迴圈遍歷所有原素找尋 target
        for (int i = 0; i < rowN; i++) {
            for (int j = 0; j < colN; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
